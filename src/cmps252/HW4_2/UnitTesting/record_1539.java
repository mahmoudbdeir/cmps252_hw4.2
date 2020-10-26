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
class Record_1539 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1539: FirstName is Ramon")
	void FirstNameOfRecord1539() {
		assertEquals("Ramon", customers.get(1538).getFirstName());
	}

	@Test
	@DisplayName("Record 1539: LastName is Quinlivan")
	void LastNameOfRecord1539() {
		assertEquals("Quinlivan", customers.get(1538).getLastName());
	}

	@Test
	@DisplayName("Record 1539: Company is Vance, William A")
	void CompanyOfRecord1539() {
		assertEquals("Vance, William A", customers.get(1538).getCompany());
	}

	@Test
	@DisplayName("Record 1539: Address is 317 S Main St")
	void AddressOfRecord1539() {
		assertEquals("317 S Main St", customers.get(1538).getAddress());
	}

	@Test
	@DisplayName("Record 1539: City is Anthony")
	void CityOfRecord1539() {
		assertEquals("Anthony", customers.get(1538).getCity());
	}

	@Test
	@DisplayName("Record 1539: County is El Paso")
	void CountyOfRecord1539() {
		assertEquals("El Paso", customers.get(1538).getCounty());
	}

	@Test
	@DisplayName("Record 1539: State is TX")
	void StateOfRecord1539() {
		assertEquals("TX", customers.get(1538).getState());
	}

	@Test
	@DisplayName("Record 1539: ZIP is 79821")
	void ZIPOfRecord1539() {
		assertEquals("79821", customers.get(1538).getZIP());
	}

	@Test
	@DisplayName("Record 1539: Phone is 915-886-1565")
	void PhoneOfRecord1539() {
		assertEquals("915-886-1565", customers.get(1538).getPhone());
	}

	@Test
	@DisplayName("Record 1539: Fax is 915-886-4661")
	void FaxOfRecord1539() {
		assertEquals("915-886-4661", customers.get(1538).getFax());
	}

	@Test
	@DisplayName("Record 1539: Email is ramon@quinlivan.com")
	void EmailOfRecord1539() {
		assertEquals("ramon@quinlivan.com", customers.get(1538).getEmail());
	}

	@Test
	@DisplayName("Record 1539: Web is http://www.ramonquinlivan.com")
	void WebOfRecord1539() {
		assertEquals("http://www.ramonquinlivan.com", customers.get(1538).getWeb());
	}
}
