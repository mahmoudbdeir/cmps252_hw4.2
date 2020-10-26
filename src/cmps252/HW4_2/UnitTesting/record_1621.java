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

@Tag("6")
class Record_1621 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1621: FirstName is Mathew")
	void FirstNameOfRecord1621() {
		assertEquals("Mathew", customers.get(1620).getFirstName());
	}

	@Test
	@DisplayName("Record 1621: LastName is Paravano")
	void LastNameOfRecord1621() {
		assertEquals("Paravano", customers.get(1620).getLastName());
	}

	@Test
	@DisplayName("Record 1621: Company is Xerox Corporation")
	void CompanyOfRecord1621() {
		assertEquals("Xerox Corporation", customers.get(1620).getCompany());
	}

	@Test
	@DisplayName("Record 1621: Address is 2100 Fillmore Ave")
	void AddressOfRecord1621() {
		assertEquals("2100 Fillmore Ave", customers.get(1620).getAddress());
	}

	@Test
	@DisplayName("Record 1621: City is Buffalo")
	void CityOfRecord1621() {
		assertEquals("Buffalo", customers.get(1620).getCity());
	}

	@Test
	@DisplayName("Record 1621: County is Erie")
	void CountyOfRecord1621() {
		assertEquals("Erie", customers.get(1620).getCounty());
	}

	@Test
	@DisplayName("Record 1621: State is NY")
	void StateOfRecord1621() {
		assertEquals("NY", customers.get(1620).getState());
	}

	@Test
	@DisplayName("Record 1621: ZIP is 14214")
	void ZIPOfRecord1621() {
		assertEquals("14214", customers.get(1620).getZIP());
	}

	@Test
	@DisplayName("Record 1621: Phone is 716-837-2692")
	void PhoneOfRecord1621() {
		assertEquals("716-837-2692", customers.get(1620).getPhone());
	}

	@Test
	@DisplayName("Record 1621: Fax is 716-837-0824")
	void FaxOfRecord1621() {
		assertEquals("716-837-0824", customers.get(1620).getFax());
	}

	@Test
	@DisplayName("Record 1621: Email is mathew@paravano.com")
	void EmailOfRecord1621() {
		assertEquals("mathew@paravano.com", customers.get(1620).getEmail());
	}

	@Test
	@DisplayName("Record 1621: Web is http://www.mathewparavano.com")
	void WebOfRecord1621() {
		assertEquals("http://www.mathewparavano.com", customers.get(1620).getWeb());
	}
}
