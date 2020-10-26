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

@Tag("8")
class Record_965 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 965: FirstName is Neva")
	void FirstNameOfRecord965() {
		assertEquals("Neva", customers.get(964).getFirstName());
	}

	@Test
	@DisplayName("Record 965: LastName is Lebarge")
	void LastNameOfRecord965() {
		assertEquals("Lebarge", customers.get(964).getLastName());
	}

	@Test
	@DisplayName("Record 965: Company is Mays, Richard")
	void CompanyOfRecord965() {
		assertEquals("Mays, Richard", customers.get(964).getCompany());
	}

	@Test
	@DisplayName("Record 965: Address is 4000 General Degaulle Dr")
	void AddressOfRecord965() {
		assertEquals("4000 General Degaulle Dr", customers.get(964).getAddress());
	}

	@Test
	@DisplayName("Record 965: City is New Orleans")
	void CityOfRecord965() {
		assertEquals("New Orleans", customers.get(964).getCity());
	}

	@Test
	@DisplayName("Record 965: County is Orleans")
	void CountyOfRecord965() {
		assertEquals("Orleans", customers.get(964).getCounty());
	}

	@Test
	@DisplayName("Record 965: State is LA")
	void StateOfRecord965() {
		assertEquals("LA", customers.get(964).getState());
	}

	@Test
	@DisplayName("Record 965: ZIP is 70114")
	void ZIPOfRecord965() {
		assertEquals("70114", customers.get(964).getZIP());
	}

	@Test
	@DisplayName("Record 965: Phone is 504-363-4633")
	void PhoneOfRecord965() {
		assertEquals("504-363-4633", customers.get(964).getPhone());
	}

	@Test
	@DisplayName("Record 965: Fax is 504-363-7644")
	void FaxOfRecord965() {
		assertEquals("504-363-7644", customers.get(964).getFax());
	}

	@Test
	@DisplayName("Record 965: Email is neva@lebarge.com")
	void EmailOfRecord965() {
		assertEquals("neva@lebarge.com", customers.get(964).getEmail());
	}

	@Test
	@DisplayName("Record 965: Web is http://www.nevalebarge.com")
	void WebOfRecord965() {
		assertEquals("http://www.nevalebarge.com", customers.get(964).getWeb());
	}
}
