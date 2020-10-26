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

@Tag("22")
class Record_2816 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2816: FirstName is Howard")
	void FirstNameOfRecord2816() {
		assertEquals("Howard", customers.get(2815).getFirstName());
	}

	@Test
	@DisplayName("Record 2816: LastName is Jeschke")
	void LastNameOfRecord2816() {
		assertEquals("Jeschke", customers.get(2815).getLastName());
	}

	@Test
	@DisplayName("Record 2816: Company is Copperfield Inn")
	void CompanyOfRecord2816() {
		assertEquals("Copperfield Inn", customers.get(2815).getCompany());
	}

	@Test
	@DisplayName("Record 2816: Address is 1157 Highland Ave  #-206")
	void AddressOfRecord2816() {
		assertEquals("1157 Highland Ave  #-206", customers.get(2815).getAddress());
	}

	@Test
	@DisplayName("Record 2816: City is Cheshire")
	void CityOfRecord2816() {
		assertEquals("Cheshire", customers.get(2815).getCity());
	}

	@Test
	@DisplayName("Record 2816: County is New Haven")
	void CountyOfRecord2816() {
		assertEquals("New Haven", customers.get(2815).getCounty());
	}

	@Test
	@DisplayName("Record 2816: State is CT")
	void StateOfRecord2816() {
		assertEquals("CT", customers.get(2815).getState());
	}

	@Test
	@DisplayName("Record 2816: ZIP is 6410")
	void ZIPOfRecord2816() {
		assertEquals("6410", customers.get(2815).getZIP());
	}

	@Test
	@DisplayName("Record 2816: Phone is 203-271-8549")
	void PhoneOfRecord2816() {
		assertEquals("203-271-8549", customers.get(2815).getPhone());
	}

	@Test
	@DisplayName("Record 2816: Fax is 203-271-4837")
	void FaxOfRecord2816() {
		assertEquals("203-271-4837", customers.get(2815).getFax());
	}

	@Test
	@DisplayName("Record 2816: Email is howard@jeschke.com")
	void EmailOfRecord2816() {
		assertEquals("howard@jeschke.com", customers.get(2815).getEmail());
	}

	@Test
	@DisplayName("Record 2816: Web is http://www.howardjeschke.com")
	void WebOfRecord2816() {
		assertEquals("http://www.howardjeschke.com", customers.get(2815).getWeb());
	}
}
