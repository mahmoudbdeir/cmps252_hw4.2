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

@Tag("17")
class Record_2625 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2625: FirstName is Chas")
	void FirstNameOfRecord2625() {
		assertEquals("Chas", customers.get(2624).getFirstName());
	}

	@Test
	@DisplayName("Record 2625: LastName is Hedgebeth")
	void LastNameOfRecord2625() {
		assertEquals("Hedgebeth", customers.get(2624).getLastName());
	}

	@Test
	@DisplayName("Record 2625: Company is Bambis Roofing Inc")
	void CompanyOfRecord2625() {
		assertEquals("Bambis Roofing Inc", customers.get(2624).getCompany());
	}

	@Test
	@DisplayName("Record 2625: Address is 1602 E State St")
	void AddressOfRecord2625() {
		assertEquals("1602 E State St", customers.get(2624).getAddress());
	}

	@Test
	@DisplayName("Record 2625: City is Trenton")
	void CityOfRecord2625() {
		assertEquals("Trenton", customers.get(2624).getCity());
	}

	@Test
	@DisplayName("Record 2625: County is Mercer")
	void CountyOfRecord2625() {
		assertEquals("Mercer", customers.get(2624).getCounty());
	}

	@Test
	@DisplayName("Record 2625: State is NJ")
	void StateOfRecord2625() {
		assertEquals("NJ", customers.get(2624).getState());
	}

	@Test
	@DisplayName("Record 2625: ZIP is 8609")
	void ZIPOfRecord2625() {
		assertEquals("8609", customers.get(2624).getZIP());
	}

	@Test
	@DisplayName("Record 2625: Phone is 609-586-6358")
	void PhoneOfRecord2625() {
		assertEquals("609-586-6358", customers.get(2624).getPhone());
	}

	@Test
	@DisplayName("Record 2625: Fax is 609-586-3196")
	void FaxOfRecord2625() {
		assertEquals("609-586-3196", customers.get(2624).getFax());
	}

	@Test
	@DisplayName("Record 2625: Email is chas@hedgebeth.com")
	void EmailOfRecord2625() {
		assertEquals("chas@hedgebeth.com", customers.get(2624).getEmail());
	}

	@Test
	@DisplayName("Record 2625: Web is http://www.chashedgebeth.com")
	void WebOfRecord2625() {
		assertEquals("http://www.chashedgebeth.com", customers.get(2624).getWeb());
	}
}
