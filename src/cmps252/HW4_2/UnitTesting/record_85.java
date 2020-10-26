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

@Tag("1")
class Record_85 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 85: FirstName is Antonia")
	void FirstNameOfRecord85() {
		assertEquals("Antonia", customers.get(84).getFirstName());
	}

	@Test
	@DisplayName("Record 85: LastName is Bodie")
	void LastNameOfRecord85() {
		assertEquals("Bodie", customers.get(84).getLastName());
	}

	@Test
	@DisplayName("Record 85: Company is Yeary & Associates")
	void CompanyOfRecord85() {
		assertEquals("Yeary & Associates", customers.get(84).getCompany());
	}

	@Test
	@DisplayName("Record 85: Address is 2857 Beach Dr")
	void AddressOfRecord85() {
		assertEquals("2857 Beach Dr", customers.get(84).getAddress());
	}

	@Test
	@DisplayName("Record 85: City is Merrick")
	void CityOfRecord85() {
		assertEquals("Merrick", customers.get(84).getCity());
	}

	@Test
	@DisplayName("Record 85: County is Nassau")
	void CountyOfRecord85() {
		assertEquals("Nassau", customers.get(84).getCounty());
	}

	@Test
	@DisplayName("Record 85: State is NY")
	void StateOfRecord85() {
		assertEquals("NY", customers.get(84).getState());
	}

	@Test
	@DisplayName("Record 85: ZIP is 11566")
	void ZIPOfRecord85() {
		assertEquals("11566", customers.get(84).getZIP());
	}

	@Test
	@DisplayName("Record 85: Phone is 516-223-2927")
	void PhoneOfRecord85() {
		assertEquals("516-223-2927", customers.get(84).getPhone());
	}

	@Test
	@DisplayName("Record 85: Fax is 516-223-3628")
	void FaxOfRecord85() {
		assertEquals("516-223-3628", customers.get(84).getFax());
	}

	@Test
	@DisplayName("Record 85: Email is antonia@bodie.com")
	void EmailOfRecord85() {
		assertEquals("antonia@bodie.com", customers.get(84).getEmail());
	}

	@Test
	@DisplayName("Record 85: Web is http://www.antoniabodie.com")
	void WebOfRecord85() {
		assertEquals("http://www.antoniabodie.com", customers.get(84).getWeb());
	}
}
