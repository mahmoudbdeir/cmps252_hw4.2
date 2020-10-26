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

@Tag("11")
class Record_3287 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3287: FirstName is Geri")
	void FirstNameOfRecord3287() {
		assertEquals("Geri", customers.get(3286).getFirstName());
	}

	@Test
	@DisplayName("Record 3287: LastName is Vanwormer")
	void LastNameOfRecord3287() {
		assertEquals("Vanwormer", customers.get(3286).getLastName());
	}

	@Test
	@DisplayName("Record 3287: Company is Durkin, Joe")
	void CompanyOfRecord3287() {
		assertEquals("Durkin, Joe", customers.get(3286).getCompany());
	}

	@Test
	@DisplayName("Record 3287: Address is 612 Fern Ave")
	void AddressOfRecord3287() {
		assertEquals("612 Fern Ave", customers.get(3286).getAddress());
	}

	@Test
	@DisplayName("Record 3287: City is Daytona Beach")
	void CityOfRecord3287() {
		assertEquals("Daytona Beach", customers.get(3286).getCity());
	}

	@Test
	@DisplayName("Record 3287: County is Volusia")
	void CountyOfRecord3287() {
		assertEquals("Volusia", customers.get(3286).getCounty());
	}

	@Test
	@DisplayName("Record 3287: State is FL")
	void StateOfRecord3287() {
		assertEquals("FL", customers.get(3286).getState());
	}

	@Test
	@DisplayName("Record 3287: ZIP is 32117")
	void ZIPOfRecord3287() {
		assertEquals("32117", customers.get(3286).getZIP());
	}

	@Test
	@DisplayName("Record 3287: Phone is 386-255-4044")
	void PhoneOfRecord3287() {
		assertEquals("386-255-4044", customers.get(3286).getPhone());
	}

	@Test
	@DisplayName("Record 3287: Fax is 386-255-5823")
	void FaxOfRecord3287() {
		assertEquals("386-255-5823", customers.get(3286).getFax());
	}

	@Test
	@DisplayName("Record 3287: Email is geri@vanwormer.com")
	void EmailOfRecord3287() {
		assertEquals("geri@vanwormer.com", customers.get(3286).getEmail());
	}

	@Test
	@DisplayName("Record 3287: Web is http://www.gerivanwormer.com")
	void WebOfRecord3287() {
		assertEquals("http://www.gerivanwormer.com", customers.get(3286).getWeb());
	}
}
