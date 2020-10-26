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

@Tag("13")
class Record_4197 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4197: FirstName is Mia")
	void FirstNameOfRecord4197() {
		assertEquals("Mia", customers.get(4196).getFirstName());
	}

	@Test
	@DisplayName("Record 4197: LastName is Askia")
	void LastNameOfRecord4197() {
		assertEquals("Askia", customers.get(4196).getLastName());
	}

	@Test
	@DisplayName("Record 4197: Company is Kinkos Copies")
	void CompanyOfRecord4197() {
		assertEquals("Kinkos Copies", customers.get(4196).getCompany());
	}

	@Test
	@DisplayName("Record 4197: Address is 603 S Washington Ave")
	void AddressOfRecord4197() {
		assertEquals("603 S Washington Ave", customers.get(4196).getAddress());
	}

	@Test
	@DisplayName("Record 4197: City is Lansing")
	void CityOfRecord4197() {
		assertEquals("Lansing", customers.get(4196).getCity());
	}

	@Test
	@DisplayName("Record 4197: County is Ingham")
	void CountyOfRecord4197() {
		assertEquals("Ingham", customers.get(4196).getCounty());
	}

	@Test
	@DisplayName("Record 4197: State is MI")
	void StateOfRecord4197() {
		assertEquals("MI", customers.get(4196).getState());
	}

	@Test
	@DisplayName("Record 4197: ZIP is 48933")
	void ZIPOfRecord4197() {
		assertEquals("48933", customers.get(4196).getZIP());
	}

	@Test
	@DisplayName("Record 4197: Phone is 517-372-1792")
	void PhoneOfRecord4197() {
		assertEquals("517-372-1792", customers.get(4196).getPhone());
	}

	@Test
	@DisplayName("Record 4197: Fax is 517-372-9376")
	void FaxOfRecord4197() {
		assertEquals("517-372-9376", customers.get(4196).getFax());
	}

	@Test
	@DisplayName("Record 4197: Email is mia@askia.com")
	void EmailOfRecord4197() {
		assertEquals("mia@askia.com", customers.get(4196).getEmail());
	}

	@Test
	@DisplayName("Record 4197: Web is http://www.miaaskia.com")
	void WebOfRecord4197() {
		assertEquals("http://www.miaaskia.com", customers.get(4196).getWeb());
	}
}
