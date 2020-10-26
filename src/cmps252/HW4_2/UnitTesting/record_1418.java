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

@Tag("32")
class Record_1418 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1418: FirstName is Ariel")
	void FirstNameOfRecord1418() {
		assertEquals("Ariel", customers.get(1417).getFirstName());
	}

	@Test
	@DisplayName("Record 1418: LastName is Hamiel")
	void LastNameOfRecord1418() {
		assertEquals("Hamiel", customers.get(1417).getLastName());
	}

	@Test
	@DisplayName("Record 1418: Company is Kimura Denyoki Inc")
	void CompanyOfRecord1418() {
		assertEquals("Kimura Denyoki Inc", customers.get(1417).getCompany());
	}

	@Test
	@DisplayName("Record 1418: Address is 211 E Main St")
	void AddressOfRecord1418() {
		assertEquals("211 E Main St", customers.get(1417).getAddress());
	}

	@Test
	@DisplayName("Record 1418: City is Lewistown")
	void CityOfRecord1418() {
		assertEquals("Lewistown", customers.get(1417).getCity());
	}

	@Test
	@DisplayName("Record 1418: County is Fergus")
	void CountyOfRecord1418() {
		assertEquals("Fergus", customers.get(1417).getCounty());
	}

	@Test
	@DisplayName("Record 1418: State is MT")
	void StateOfRecord1418() {
		assertEquals("MT", customers.get(1417).getState());
	}

	@Test
	@DisplayName("Record 1418: ZIP is 59457")
	void ZIPOfRecord1418() {
		assertEquals("59457", customers.get(1417).getZIP());
	}

	@Test
	@DisplayName("Record 1418: Phone is 406-538-6149")
	void PhoneOfRecord1418() {
		assertEquals("406-538-6149", customers.get(1417).getPhone());
	}

	@Test
	@DisplayName("Record 1418: Fax is 406-538-5599")
	void FaxOfRecord1418() {
		assertEquals("406-538-5599", customers.get(1417).getFax());
	}

	@Test
	@DisplayName("Record 1418: Email is ariel@hamiel.com")
	void EmailOfRecord1418() {
		assertEquals("ariel@hamiel.com", customers.get(1417).getEmail());
	}

	@Test
	@DisplayName("Record 1418: Web is http://www.arielhamiel.com")
	void WebOfRecord1418() {
		assertEquals("http://www.arielhamiel.com", customers.get(1417).getWeb());
	}
}
