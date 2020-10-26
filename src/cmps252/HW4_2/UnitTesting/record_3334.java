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

@Tag("24")
class Record_3334 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3334: FirstName is Beverley")
	void FirstNameOfRecord3334() {
		assertEquals("Beverley", customers.get(3333).getFirstName());
	}

	@Test
	@DisplayName("Record 3334: LastName is Schilk")
	void LastNameOfRecord3334() {
		assertEquals("Schilk", customers.get(3333).getLastName());
	}

	@Test
	@DisplayName("Record 3334: Company is Wahl, Travis J Esq")
	void CompanyOfRecord3334() {
		assertEquals("Wahl, Travis J Esq", customers.get(3333).getCompany());
	}

	@Test
	@DisplayName("Record 3334: Address is 445 Broadway")
	void AddressOfRecord3334() {
		assertEquals("445 Broadway", customers.get(3333).getAddress());
	}

	@Test
	@DisplayName("Record 3334: City is Denver")
	void CityOfRecord3334() {
		assertEquals("Denver", customers.get(3333).getCity());
	}

	@Test
	@DisplayName("Record 3334: County is Denver")
	void CountyOfRecord3334() {
		assertEquals("Denver", customers.get(3333).getCounty());
	}

	@Test
	@DisplayName("Record 3334: State is CO")
	void StateOfRecord3334() {
		assertEquals("CO", customers.get(3333).getState());
	}

	@Test
	@DisplayName("Record 3334: ZIP is 80203")
	void ZIPOfRecord3334() {
		assertEquals("80203", customers.get(3333).getZIP());
	}

	@Test
	@DisplayName("Record 3334: Phone is 303-722-3893")
	void PhoneOfRecord3334() {
		assertEquals("303-722-3893", customers.get(3333).getPhone());
	}

	@Test
	@DisplayName("Record 3334: Fax is 303-722-6476")
	void FaxOfRecord3334() {
		assertEquals("303-722-6476", customers.get(3333).getFax());
	}

	@Test
	@DisplayName("Record 3334: Email is beverley@schilk.com")
	void EmailOfRecord3334() {
		assertEquals("beverley@schilk.com", customers.get(3333).getEmail());
	}

	@Test
	@DisplayName("Record 3334: Web is http://www.beverleyschilk.com")
	void WebOfRecord3334() {
		assertEquals("http://www.beverleyschilk.com", customers.get(3333).getWeb());
	}
}
