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

@Tag("18")
class Record_4934 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4934: FirstName is Ezra")
	void FirstNameOfRecord4934() {
		assertEquals("Ezra", customers.get(4933).getFirstName());
	}

	@Test
	@DisplayName("Record 4934: LastName is Wesly")
	void LastNameOfRecord4934() {
		assertEquals("Wesly", customers.get(4933).getLastName());
	}

	@Test
	@DisplayName("Record 4934: Company is Chicoine, Patricia H Esq")
	void CompanyOfRecord4934() {
		assertEquals("Chicoine, Patricia H Esq", customers.get(4933).getCompany());
	}

	@Test
	@DisplayName("Record 4934: Address is 402b N A Driv")
	void AddressOfRecord4934() {
		assertEquals("402b N A Driv", customers.get(4933).getAddress());
	}

	@Test
	@DisplayName("Record 4934: City is Nashville")
	void CityOfRecord4934() {
		assertEquals("Nashville", customers.get(4933).getCity());
	}

	@Test
	@DisplayName("Record 4934: County is Davidson")
	void CountyOfRecord4934() {
		assertEquals("Davidson", customers.get(4933).getCounty());
	}

	@Test
	@DisplayName("Record 4934: State is TN")
	void StateOfRecord4934() {
		assertEquals("TN", customers.get(4933).getState());
	}

	@Test
	@DisplayName("Record 4934: ZIP is 37217")
	void ZIPOfRecord4934() {
		assertEquals("37217", customers.get(4933).getZIP());
	}

	@Test
	@DisplayName("Record 4934: Phone is 615-360-2703")
	void PhoneOfRecord4934() {
		assertEquals("615-360-2703", customers.get(4933).getPhone());
	}

	@Test
	@DisplayName("Record 4934: Fax is 615-360-5638")
	void FaxOfRecord4934() {
		assertEquals("615-360-5638", customers.get(4933).getFax());
	}

	@Test
	@DisplayName("Record 4934: Email is ezra@wesly.com")
	void EmailOfRecord4934() {
		assertEquals("ezra@wesly.com", customers.get(4933).getEmail());
	}

	@Test
	@DisplayName("Record 4934: Web is http://www.ezrawesly.com")
	void WebOfRecord4934() {
		assertEquals("http://www.ezrawesly.com", customers.get(4933).getWeb());
	}
}
