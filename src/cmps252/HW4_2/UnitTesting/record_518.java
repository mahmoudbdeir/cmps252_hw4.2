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

@Tag("14")
class Record_518 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 518: FirstName is Whitney")
	void FirstNameOfRecord518() {
		assertEquals("Whitney", customers.get(517).getFirstName());
	}

	@Test
	@DisplayName("Record 518: LastName is Cocomazzi")
	void LastNameOfRecord518() {
		assertEquals("Cocomazzi", customers.get(517).getLastName());
	}

	@Test
	@DisplayName("Record 518: Company is Taylor Made Labels Inc")
	void CompanyOfRecord518() {
		assertEquals("Taylor Made Labels Inc", customers.get(517).getCompany());
	}

	@Test
	@DisplayName("Record 518: Address is 700 S Pierce St")
	void AddressOfRecord518() {
		assertEquals("700 S Pierce St", customers.get(517).getAddress());
	}

	@Test
	@DisplayName("Record 518: City is Amarillo")
	void CityOfRecord518() {
		assertEquals("Amarillo", customers.get(517).getCity());
	}

	@Test
	@DisplayName("Record 518: County is Potter")
	void CountyOfRecord518() {
		assertEquals("Potter", customers.get(517).getCounty());
	}

	@Test
	@DisplayName("Record 518: State is TX")
	void StateOfRecord518() {
		assertEquals("TX", customers.get(517).getState());
	}

	@Test
	@DisplayName("Record 518: ZIP is 79101")
	void ZIPOfRecord518() {
		assertEquals("79101", customers.get(517).getZIP());
	}

	@Test
	@DisplayName("Record 518: Phone is 806-372-1708")
	void PhoneOfRecord518() {
		assertEquals("806-372-1708", customers.get(517).getPhone());
	}

	@Test
	@DisplayName("Record 518: Fax is 806-372-1956")
	void FaxOfRecord518() {
		assertEquals("806-372-1956", customers.get(517).getFax());
	}

	@Test
	@DisplayName("Record 518: Email is whitney@cocomazzi.com")
	void EmailOfRecord518() {
		assertEquals("whitney@cocomazzi.com", customers.get(517).getEmail());
	}

	@Test
	@DisplayName("Record 518: Web is http://www.whitneycocomazzi.com")
	void WebOfRecord518() {
		assertEquals("http://www.whitneycocomazzi.com", customers.get(517).getWeb());
	}
}
