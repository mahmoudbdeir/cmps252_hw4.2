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

@Tag("33")
class Record_1311 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1311: FirstName is Jeramy")
	void FirstNameOfRecord1311() {
		assertEquals("Jeramy", customers.get(1310).getFirstName());
	}

	@Test
	@DisplayName("Record 1311: LastName is Tyburski")
	void LastNameOfRecord1311() {
		assertEquals("Tyburski", customers.get(1310).getLastName());
	}

	@Test
	@DisplayName("Record 1311: Company is Macadam Computers")
	void CompanyOfRecord1311() {
		assertEquals("Macadam Computers", customers.get(1310).getCompany());
	}

	@Test
	@DisplayName("Record 1311: Address is 103 N Appleknocker Dr")
	void AddressOfRecord1311() {
		assertEquals("103 N Appleknocker Dr", customers.get(1310).getAddress());
	}

	@Test
	@DisplayName("Record 1311: City is Cobden")
	void CityOfRecord1311() {
		assertEquals("Cobden", customers.get(1310).getCity());
	}

	@Test
	@DisplayName("Record 1311: County is Union")
	void CountyOfRecord1311() {
		assertEquals("Union", customers.get(1310).getCounty());
	}

	@Test
	@DisplayName("Record 1311: State is IL")
	void StateOfRecord1311() {
		assertEquals("IL", customers.get(1310).getState());
	}

	@Test
	@DisplayName("Record 1311: ZIP is 62920")
	void ZIPOfRecord1311() {
		assertEquals("62920", customers.get(1310).getZIP());
	}

	@Test
	@DisplayName("Record 1311: Phone is 618-893-8023")
	void PhoneOfRecord1311() {
		assertEquals("618-893-8023", customers.get(1310).getPhone());
	}

	@Test
	@DisplayName("Record 1311: Fax is 618-893-1656")
	void FaxOfRecord1311() {
		assertEquals("618-893-1656", customers.get(1310).getFax());
	}

	@Test
	@DisplayName("Record 1311: Email is jeramy@tyburski.com")
	void EmailOfRecord1311() {
		assertEquals("jeramy@tyburski.com", customers.get(1310).getEmail());
	}

	@Test
	@DisplayName("Record 1311: Web is http://www.jeramytyburski.com")
	void WebOfRecord1311() {
		assertEquals("http://www.jeramytyburski.com", customers.get(1310).getWeb());
	}
}
