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

@Tag("11")
class Record_1734 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1734: FirstName is Susie")
	void FirstNameOfRecord1734() {
		assertEquals("Susie", customers.get(1733).getFirstName());
	}

	@Test
	@DisplayName("Record 1734: LastName is Beardall")
	void LastNameOfRecord1734() {
		assertEquals("Beardall", customers.get(1733).getLastName());
	}

	@Test
	@DisplayName("Record 1734: Company is Jtm Company")
	void CompanyOfRecord1734() {
		assertEquals("Jtm Company", customers.get(1733).getCompany());
	}

	@Test
	@DisplayName("Record 1734: Address is 2000 W Nash St")
	void AddressOfRecord1734() {
		assertEquals("2000 W Nash St", customers.get(1733).getAddress());
	}

	@Test
	@DisplayName("Record 1734: City is Wilson")
	void CityOfRecord1734() {
		assertEquals("Wilson", customers.get(1733).getCity());
	}

	@Test
	@DisplayName("Record 1734: County is Wilson")
	void CountyOfRecord1734() {
		assertEquals("Wilson", customers.get(1733).getCounty());
	}

	@Test
	@DisplayName("Record 1734: State is NC")
	void StateOfRecord1734() {
		assertEquals("NC", customers.get(1733).getState());
	}

	@Test
	@DisplayName("Record 1734: ZIP is 27893")
	void ZIPOfRecord1734() {
		assertEquals("27893", customers.get(1733).getZIP());
	}

	@Test
	@DisplayName("Record 1734: Phone is 252-243-4927")
	void PhoneOfRecord1734() {
		assertEquals("252-243-4927", customers.get(1733).getPhone());
	}

	@Test
	@DisplayName("Record 1734: Fax is 252-243-9718")
	void FaxOfRecord1734() {
		assertEquals("252-243-9718", customers.get(1733).getFax());
	}

	@Test
	@DisplayName("Record 1734: Email is susie@beardall.com")
	void EmailOfRecord1734() {
		assertEquals("susie@beardall.com", customers.get(1733).getEmail());
	}

	@Test
	@DisplayName("Record 1734: Web is http://www.susiebeardall.com")
	void WebOfRecord1734() {
		assertEquals("http://www.susiebeardall.com", customers.get(1733).getWeb());
	}
}
