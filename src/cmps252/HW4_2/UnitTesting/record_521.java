package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("21")
class Record_521 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 521: FirstName is Noreen")
	void FirstNameOfRecord521() {
		assertEquals("Noreen", customers.get(520).getFirstName());
	}

	@Test
	@DisplayName("Record 521: LastName is Flair")
	void LastNameOfRecord521() {
		assertEquals("Flair", customers.get(520).getLastName());
	}

	@Test
	@DisplayName("Record 521: Company is Geds Carpets")
	void CompanyOfRecord521() {
		assertEquals("Geds Carpets", customers.get(520).getCompany());
	}

	@Test
	@DisplayName("Record 521: Address is 38917 20th St E  #-a106")
	void AddressOfRecord521() {
		assertEquals("38917 20th St E  #-a106", customers.get(520).getAddress());
	}

	@Test
	@DisplayName("Record 521: City is Palmdale")
	void CityOfRecord521() {
		assertEquals("Palmdale", customers.get(520).getCity());
	}

	@Test
	@DisplayName("Record 521: County is Los Angeles")
	void CountyOfRecord521() {
		assertEquals("Los Angeles", customers.get(520).getCounty());
	}

	@Test
	@DisplayName("Record 521: State is CA")
	void StateOfRecord521() {
		assertEquals("CA", customers.get(520).getState());
	}

	@Test
	@DisplayName("Record 521: ZIP is 93550")
	void ZIPOfRecord521() {
		assertEquals("93550", customers.get(520).getZIP());
	}

	@Test
	@DisplayName("Record 521: Phone is 661-273-9691")
	void PhoneOfRecord521() {
		assertEquals("661-273-9691", customers.get(520).getPhone());
	}

	@Test
	@DisplayName("Record 521: Fax is 661-273-2892")
	void FaxOfRecord521() {
		assertEquals("661-273-2892", customers.get(520).getFax());
	}

	@Test
	@DisplayName("Record 521: Email is noreen@flair.com")
	void EmailOfRecord521() {
		assertEquals("noreen@flair.com", customers.get(520).getEmail());
	}

	@Test
	@DisplayName("Record 521: Web is http://www.noreenflair.com")
	void WebOfRecord521() {
		assertEquals("http://www.noreenflair.com", customers.get(520).getWeb());
	}
}
