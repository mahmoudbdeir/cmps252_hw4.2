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

@Tag("0")
class Record_1119 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1119: FirstName is Lakesha")
	void FirstNameOfRecord1119() {
		assertEquals("Lakesha", customers.get(1118).getFirstName());
	}

	@Test
	@DisplayName("Record 1119: LastName is Vejarano")
	void LastNameOfRecord1119() {
		assertEquals("Vejarano", customers.get(1118).getLastName());
	}

	@Test
	@DisplayName("Record 1119: Company is Monzo, Lisa Galloway Esq")
	void CompanyOfRecord1119() {
		assertEquals("Monzo, Lisa Galloway Esq", customers.get(1118).getCompany());
	}

	@Test
	@DisplayName("Record 1119: Address is 2750 S Hardy Dr")
	void AddressOfRecord1119() {
		assertEquals("2750 S Hardy Dr", customers.get(1118).getAddress());
	}

	@Test
	@DisplayName("Record 1119: City is Tempe")
	void CityOfRecord1119() {
		assertEquals("Tempe", customers.get(1118).getCity());
	}

	@Test
	@DisplayName("Record 1119: County is Maricopa")
	void CountyOfRecord1119() {
		assertEquals("Maricopa", customers.get(1118).getCounty());
	}

	@Test
	@DisplayName("Record 1119: State is AZ")
	void StateOfRecord1119() {
		assertEquals("AZ", customers.get(1118).getState());
	}

	@Test
	@DisplayName("Record 1119: ZIP is 85282")
	void ZIPOfRecord1119() {
		assertEquals("85282", customers.get(1118).getZIP());
	}

	@Test
	@DisplayName("Record 1119: Phone is 480-829-6317")
	void PhoneOfRecord1119() {
		assertEquals("480-829-6317", customers.get(1118).getPhone());
	}

	@Test
	@DisplayName("Record 1119: Fax is 480-829-0548")
	void FaxOfRecord1119() {
		assertEquals("480-829-0548", customers.get(1118).getFax());
	}

	@Test
	@DisplayName("Record 1119: Email is lakesha@vejarano.com")
	void EmailOfRecord1119() {
		assertEquals("lakesha@vejarano.com", customers.get(1118).getEmail());
	}

	@Test
	@DisplayName("Record 1119: Web is http://www.lakeshavejarano.com")
	void WebOfRecord1119() {
		assertEquals("http://www.lakeshavejarano.com", customers.get(1118).getWeb());
	}
}
