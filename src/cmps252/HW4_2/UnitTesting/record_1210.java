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
class Record_1210 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1210: FirstName is Carolyn")
	void FirstNameOfRecord1210() {
		assertEquals("Carolyn", customers.get(1209).getFirstName());
	}

	@Test
	@DisplayName("Record 1210: LastName is Godleski")
	void LastNameOfRecord1210() {
		assertEquals("Godleski", customers.get(1209).getLastName());
	}

	@Test
	@DisplayName("Record 1210: Company is Private Bank The Bank Boston")
	void CompanyOfRecord1210() {
		assertEquals("Private Bank The Bank Boston", customers.get(1209).getCompany());
	}

	@Test
	@DisplayName("Record 1210: Address is 226 S Wabash Ave")
	void AddressOfRecord1210() {
		assertEquals("226 S Wabash Ave", customers.get(1209).getAddress());
	}

	@Test
	@DisplayName("Record 1210: City is Chicago")
	void CityOfRecord1210() {
		assertEquals("Chicago", customers.get(1209).getCity());
	}

	@Test
	@DisplayName("Record 1210: County is Cook")
	void CountyOfRecord1210() {
		assertEquals("Cook", customers.get(1209).getCounty());
	}

	@Test
	@DisplayName("Record 1210: State is IL")
	void StateOfRecord1210() {
		assertEquals("IL", customers.get(1209).getState());
	}

	@Test
	@DisplayName("Record 1210: ZIP is 60604")
	void ZIPOfRecord1210() {
		assertEquals("60604", customers.get(1209).getZIP());
	}

	@Test
	@DisplayName("Record 1210: Phone is 312-427-8866")
	void PhoneOfRecord1210() {
		assertEquals("312-427-8866", customers.get(1209).getPhone());
	}

	@Test
	@DisplayName("Record 1210: Fax is 312-427-4512")
	void FaxOfRecord1210() {
		assertEquals("312-427-4512", customers.get(1209).getFax());
	}

	@Test
	@DisplayName("Record 1210: Email is carolyn@godleski.com")
	void EmailOfRecord1210() {
		assertEquals("carolyn@godleski.com", customers.get(1209).getEmail());
	}

	@Test
	@DisplayName("Record 1210: Web is http://www.carolyngodleski.com")
	void WebOfRecord1210() {
		assertEquals("http://www.carolyngodleski.com", customers.get(1209).getWeb());
	}
}
