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
class Record_1354 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1354: FirstName is Christin")
	void FirstNameOfRecord1354() {
		assertEquals("Christin", customers.get(1353).getFirstName());
	}

	@Test
	@DisplayName("Record 1354: LastName is Roskos")
	void LastNameOfRecord1354() {
		assertEquals("Roskos", customers.get(1353).getLastName());
	}

	@Test
	@DisplayName("Record 1354: Company is Metro Lighting Products Inc")
	void CompanyOfRecord1354() {
		assertEquals("Metro Lighting Products Inc", customers.get(1353).getCompany());
	}

	@Test
	@DisplayName("Record 1354: Address is Bridge St")
	void AddressOfRecord1354() {
		assertEquals("Bridge St", customers.get(1353).getAddress());
	}

	@Test
	@DisplayName("Record 1354: City is Spring City")
	void CityOfRecord1354() {
		assertEquals("Spring City", customers.get(1353).getCity());
	}

	@Test
	@DisplayName("Record 1354: County is Chester")
	void CountyOfRecord1354() {
		assertEquals("Chester", customers.get(1353).getCounty());
	}

	@Test
	@DisplayName("Record 1354: State is PA")
	void StateOfRecord1354() {
		assertEquals("PA", customers.get(1353).getState());
	}

	@Test
	@DisplayName("Record 1354: ZIP is 19475")
	void ZIPOfRecord1354() {
		assertEquals("19475", customers.get(1353).getZIP());
	}

	@Test
	@DisplayName("Record 1354: Phone is 610-948-5096")
	void PhoneOfRecord1354() {
		assertEquals("610-948-5096", customers.get(1353).getPhone());
	}

	@Test
	@DisplayName("Record 1354: Fax is 610-948-0964")
	void FaxOfRecord1354() {
		assertEquals("610-948-0964", customers.get(1353).getFax());
	}

	@Test
	@DisplayName("Record 1354: Email is christin@roskos.com")
	void EmailOfRecord1354() {
		assertEquals("christin@roskos.com", customers.get(1353).getEmail());
	}

	@Test
	@DisplayName("Record 1354: Web is http://www.christinroskos.com")
	void WebOfRecord1354() {
		assertEquals("http://www.christinroskos.com", customers.get(1353).getWeb());
	}
}
