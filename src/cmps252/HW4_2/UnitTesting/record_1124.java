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

@Tag("2")
class Record_1124 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1124: FirstName is Lenore")
	void FirstNameOfRecord1124() {
		assertEquals("Lenore", customers.get(1123).getFirstName());
	}

	@Test
	@DisplayName("Record 1124: LastName is Libbey")
	void LastNameOfRecord1124() {
		assertEquals("Libbey", customers.get(1123).getLastName());
	}

	@Test
	@DisplayName("Record 1124: Company is Boersema Realty")
	void CompanyOfRecord1124() {
		assertEquals("Boersema Realty", customers.get(1123).getCompany());
	}

	@Test
	@DisplayName("Record 1124: Address is 3349 E Mcdowell Rd")
	void AddressOfRecord1124() {
		assertEquals("3349 E Mcdowell Rd", customers.get(1123).getAddress());
	}

	@Test
	@DisplayName("Record 1124: City is Phoenix")
	void CityOfRecord1124() {
		assertEquals("Phoenix", customers.get(1123).getCity());
	}

	@Test
	@DisplayName("Record 1124: County is Maricopa")
	void CountyOfRecord1124() {
		assertEquals("Maricopa", customers.get(1123).getCounty());
	}

	@Test
	@DisplayName("Record 1124: State is AZ")
	void StateOfRecord1124() {
		assertEquals("AZ", customers.get(1123).getState());
	}

	@Test
	@DisplayName("Record 1124: ZIP is 85008")
	void ZIPOfRecord1124() {
		assertEquals("85008", customers.get(1123).getZIP());
	}

	@Test
	@DisplayName("Record 1124: Phone is 602-273-3863")
	void PhoneOfRecord1124() {
		assertEquals("602-273-3863", customers.get(1123).getPhone());
	}

	@Test
	@DisplayName("Record 1124: Fax is 602-273-3271")
	void FaxOfRecord1124() {
		assertEquals("602-273-3271", customers.get(1123).getFax());
	}

	@Test
	@DisplayName("Record 1124: Email is lenore@libbey.com")
	void EmailOfRecord1124() {
		assertEquals("lenore@libbey.com", customers.get(1123).getEmail());
	}

	@Test
	@DisplayName("Record 1124: Web is http://www.lenorelibbey.com")
	void WebOfRecord1124() {
		assertEquals("http://www.lenorelibbey.com", customers.get(1123).getWeb());
	}
}
