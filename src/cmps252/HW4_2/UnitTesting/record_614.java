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

@Tag("41")
class Record_614 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 614: FirstName is Cherry")
	void FirstNameOfRecord614() {
		assertEquals("Cherry", customers.get(613).getFirstName());
	}

	@Test
	@DisplayName("Record 614: LastName is Crouser")
	void LastNameOfRecord614() {
		assertEquals("Crouser", customers.get(613).getLastName());
	}

	@Test
	@DisplayName("Record 614: Company is Chartered, Lynn R Esq")
	void CompanyOfRecord614() {
		assertEquals("Chartered, Lynn R Esq", customers.get(613).getCompany());
	}

	@Test
	@DisplayName("Record 614: Address is 3320 S Cobb Dr")
	void AddressOfRecord614() {
		assertEquals("3320 S Cobb Dr", customers.get(613).getAddress());
	}

	@Test
	@DisplayName("Record 614: City is Smyrna")
	void CityOfRecord614() {
		assertEquals("Smyrna", customers.get(613).getCity());
	}

	@Test
	@DisplayName("Record 614: County is Cobb")
	void CountyOfRecord614() {
		assertEquals("Cobb", customers.get(613).getCounty());
	}

	@Test
	@DisplayName("Record 614: State is GA")
	void StateOfRecord614() {
		assertEquals("GA", customers.get(613).getState());
	}

	@Test
	@DisplayName("Record 614: ZIP is 30080")
	void ZIPOfRecord614() {
		assertEquals("30080", customers.get(613).getZIP());
	}

	@Test
	@DisplayName("Record 614: Phone is 770-436-8073")
	void PhoneOfRecord614() {
		assertEquals("770-436-8073", customers.get(613).getPhone());
	}

	@Test
	@DisplayName("Record 614: Fax is 770-436-8032")
	void FaxOfRecord614() {
		assertEquals("770-436-8032", customers.get(613).getFax());
	}

	@Test
	@DisplayName("Record 614: Email is cherry@crouser.com")
	void EmailOfRecord614() {
		assertEquals("cherry@crouser.com", customers.get(613).getEmail());
	}

	@Test
	@DisplayName("Record 614: Web is http://www.cherrycrouser.com")
	void WebOfRecord614() {
		assertEquals("http://www.cherrycrouser.com", customers.get(613).getWeb());
	}
}
