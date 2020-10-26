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

@Tag("4")
class Record_4597 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4597: FirstName is Flora")
	void FirstNameOfRecord4597() {
		assertEquals("Flora", customers.get(4596).getFirstName());
	}

	@Test
	@DisplayName("Record 4597: LastName is Douse")
	void LastNameOfRecord4597() {
		assertEquals("Douse", customers.get(4596).getLastName());
	}

	@Test
	@DisplayName("Record 4597: Company is Lindsay, Daniel F Esq")
	void CompanyOfRecord4597() {
		assertEquals("Lindsay, Daniel F Esq", customers.get(4596).getCompany());
	}

	@Test
	@DisplayName("Record 4597: Address is 98 Yesler Way")
	void AddressOfRecord4597() {
		assertEquals("98 Yesler Way", customers.get(4596).getAddress());
	}

	@Test
	@DisplayName("Record 4597: City is Seattle")
	void CityOfRecord4597() {
		assertEquals("Seattle", customers.get(4596).getCity());
	}

	@Test
	@DisplayName("Record 4597: County is King")
	void CountyOfRecord4597() {
		assertEquals("King", customers.get(4596).getCounty());
	}

	@Test
	@DisplayName("Record 4597: State is WA")
	void StateOfRecord4597() {
		assertEquals("WA", customers.get(4596).getState());
	}

	@Test
	@DisplayName("Record 4597: ZIP is 98104")
	void ZIPOfRecord4597() {
		assertEquals("98104", customers.get(4596).getZIP());
	}

	@Test
	@DisplayName("Record 4597: Phone is 206-224-2089")
	void PhoneOfRecord4597() {
		assertEquals("206-224-2089", customers.get(4596).getPhone());
	}

	@Test
	@DisplayName("Record 4597: Fax is 206-224-9006")
	void FaxOfRecord4597() {
		assertEquals("206-224-9006", customers.get(4596).getFax());
	}

	@Test
	@DisplayName("Record 4597: Email is flora@douse.com")
	void EmailOfRecord4597() {
		assertEquals("flora@douse.com", customers.get(4596).getEmail());
	}

	@Test
	@DisplayName("Record 4597: Web is http://www.floradouse.com")
	void WebOfRecord4597() {
		assertEquals("http://www.floradouse.com", customers.get(4596).getWeb());
	}
}
