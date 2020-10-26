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

@Tag("42")
class Record_1032 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1032: FirstName is Spencer")
	void FirstNameOfRecord1032() {
		assertEquals("Spencer", customers.get(1031).getFirstName());
	}

	@Test
	@DisplayName("Record 1032: LastName is Tignor")
	void LastNameOfRecord1032() {
		assertEquals("Tignor", customers.get(1031).getLastName());
	}

	@Test
	@DisplayName("Record 1032: Company is Jordan, Jeffery A Esq")
	void CompanyOfRecord1032() {
		assertEquals("Jordan, Jeffery A Esq", customers.get(1031).getCompany());
	}

	@Test
	@DisplayName("Record 1032: Address is 1210 E Elizabeth Ave")
	void AddressOfRecord1032() {
		assertEquals("1210 E Elizabeth Ave", customers.get(1031).getAddress());
	}

	@Test
	@DisplayName("Record 1032: City is Linden")
	void CityOfRecord1032() {
		assertEquals("Linden", customers.get(1031).getCity());
	}

	@Test
	@DisplayName("Record 1032: County is Union")
	void CountyOfRecord1032() {
		assertEquals("Union", customers.get(1031).getCounty());
	}

	@Test
	@DisplayName("Record 1032: State is NJ")
	void StateOfRecord1032() {
		assertEquals("NJ", customers.get(1031).getState());
	}

	@Test
	@DisplayName("Record 1032: ZIP is 7036")
	void ZIPOfRecord1032() {
		assertEquals("7036", customers.get(1031).getZIP());
	}

	@Test
	@DisplayName("Record 1032: Phone is 908-486-5519")
	void PhoneOfRecord1032() {
		assertEquals("908-486-5519", customers.get(1031).getPhone());
	}

	@Test
	@DisplayName("Record 1032: Fax is 908-486-0176")
	void FaxOfRecord1032() {
		assertEquals("908-486-0176", customers.get(1031).getFax());
	}

	@Test
	@DisplayName("Record 1032: Email is spencer@tignor.com")
	void EmailOfRecord1032() {
		assertEquals("spencer@tignor.com", customers.get(1031).getEmail());
	}

	@Test
	@DisplayName("Record 1032: Web is http://www.spencertignor.com")
	void WebOfRecord1032() {
		assertEquals("http://www.spencertignor.com", customers.get(1031).getWeb());
	}
}
