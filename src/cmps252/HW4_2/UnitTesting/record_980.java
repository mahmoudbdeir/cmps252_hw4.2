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

@Tag("46")
class Record_980 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 980: FirstName is Lillian")
	void FirstNameOfRecord980() {
		assertEquals("Lillian", customers.get(979).getFirstName());
	}

	@Test
	@DisplayName("Record 980: LastName is Rothe")
	void LastNameOfRecord980() {
		assertEquals("Rothe", customers.get(979).getLastName());
	}

	@Test
	@DisplayName("Record 980: Company is Evankovich, Thea G Esq")
	void CompanyOfRecord980() {
		assertEquals("Evankovich, Thea G Esq", customers.get(979).getCompany());
	}

	@Test
	@DisplayName("Record 980: Address is 2420 S Michigan Ave")
	void AddressOfRecord980() {
		assertEquals("2420 S Michigan Ave", customers.get(979).getAddress());
	}

	@Test
	@DisplayName("Record 980: City is Chicago")
	void CityOfRecord980() {
		assertEquals("Chicago", customers.get(979).getCity());
	}

	@Test
	@DisplayName("Record 980: County is Cook")
	void CountyOfRecord980() {
		assertEquals("Cook", customers.get(979).getCounty());
	}

	@Test
	@DisplayName("Record 980: State is IL")
	void StateOfRecord980() {
		assertEquals("IL", customers.get(979).getState());
	}

	@Test
	@DisplayName("Record 980: ZIP is 60616")
	void ZIPOfRecord980() {
		assertEquals("60616", customers.get(979).getZIP());
	}

	@Test
	@DisplayName("Record 980: Phone is 312-791-1992")
	void PhoneOfRecord980() {
		assertEquals("312-791-1992", customers.get(979).getPhone());
	}

	@Test
	@DisplayName("Record 980: Fax is 312-791-8794")
	void FaxOfRecord980() {
		assertEquals("312-791-8794", customers.get(979).getFax());
	}

	@Test
	@DisplayName("Record 980: Email is lillian@rothe.com")
	void EmailOfRecord980() {
		assertEquals("lillian@rothe.com", customers.get(979).getEmail());
	}

	@Test
	@DisplayName("Record 980: Web is http://www.lillianrothe.com")
	void WebOfRecord980() {
		assertEquals("http://www.lillianrothe.com", customers.get(979).getWeb());
	}
}
