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

@Tag("16")
class Record_1372 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1372: FirstName is Alexis")
	void FirstNameOfRecord1372() {
		assertEquals("Alexis", customers.get(1371).getFirstName());
	}

	@Test
	@DisplayName("Record 1372: LastName is Clankscales")
	void LastNameOfRecord1372() {
		assertEquals("Clankscales", customers.get(1371).getLastName());
	}

	@Test
	@DisplayName("Record 1372: Company is Papago Imaging")
	void CompanyOfRecord1372() {
		assertEquals("Papago Imaging", customers.get(1371).getCompany());
	}

	@Test
	@DisplayName("Record 1372: Address is 3420 N 27th Ave")
	void AddressOfRecord1372() {
		assertEquals("3420 N 27th Ave", customers.get(1371).getAddress());
	}

	@Test
	@DisplayName("Record 1372: City is Phoenix")
	void CityOfRecord1372() {
		assertEquals("Phoenix", customers.get(1371).getCity());
	}

	@Test
	@DisplayName("Record 1372: County is Maricopa")
	void CountyOfRecord1372() {
		assertEquals("Maricopa", customers.get(1371).getCounty());
	}

	@Test
	@DisplayName("Record 1372: State is AZ")
	void StateOfRecord1372() {
		assertEquals("AZ", customers.get(1371).getState());
	}

	@Test
	@DisplayName("Record 1372: ZIP is 85017")
	void ZIPOfRecord1372() {
		assertEquals("85017", customers.get(1371).getZIP());
	}

	@Test
	@DisplayName("Record 1372: Phone is 602-252-9205")
	void PhoneOfRecord1372() {
		assertEquals("602-252-9205", customers.get(1371).getPhone());
	}

	@Test
	@DisplayName("Record 1372: Fax is 602-252-3985")
	void FaxOfRecord1372() {
		assertEquals("602-252-3985", customers.get(1371).getFax());
	}

	@Test
	@DisplayName("Record 1372: Email is alexis@clankscales.com")
	void EmailOfRecord1372() {
		assertEquals("alexis@clankscales.com", customers.get(1371).getEmail());
	}

	@Test
	@DisplayName("Record 1372: Web is http://www.alexisclankscales.com")
	void WebOfRecord1372() {
		assertEquals("http://www.alexisclankscales.com", customers.get(1371).getWeb());
	}
}
