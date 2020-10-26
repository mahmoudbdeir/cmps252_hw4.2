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
class Record_1446 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1446: FirstName is Daisy")
	void FirstNameOfRecord1446() {
		assertEquals("Daisy", customers.get(1445).getFirstName());
	}

	@Test
	@DisplayName("Record 1446: LastName is Mussa")
	void LastNameOfRecord1446() {
		assertEquals("Mussa", customers.get(1445).getLastName());
	}

	@Test
	@DisplayName("Record 1446: Company is Histiocytosis X Assn Amer Inc")
	void CompanyOfRecord1446() {
		assertEquals("Histiocytosis X Assn Amer Inc", customers.get(1445).getCompany());
	}

	@Test
	@DisplayName("Record 1446: Address is 30 Massachusetts Ave")
	void AddressOfRecord1446() {
		assertEquals("30 Massachusetts Ave", customers.get(1445).getAddress());
	}

	@Test
	@DisplayName("Record 1446: City is North Andover")
	void CityOfRecord1446() {
		assertEquals("North Andover", customers.get(1445).getCity());
	}

	@Test
	@DisplayName("Record 1446: County is Essex")
	void CountyOfRecord1446() {
		assertEquals("Essex", customers.get(1445).getCounty());
	}

	@Test
	@DisplayName("Record 1446: State is MA")
	void StateOfRecord1446() {
		assertEquals("MA", customers.get(1445).getState());
	}

	@Test
	@DisplayName("Record 1446: ZIP is 1845")
	void ZIPOfRecord1446() {
		assertEquals("1845", customers.get(1445).getZIP());
	}

	@Test
	@DisplayName("Record 1446: Phone is 978-689-4445")
	void PhoneOfRecord1446() {
		assertEquals("978-689-4445", customers.get(1445).getPhone());
	}

	@Test
	@DisplayName("Record 1446: Fax is 978-689-4418")
	void FaxOfRecord1446() {
		assertEquals("978-689-4418", customers.get(1445).getFax());
	}

	@Test
	@DisplayName("Record 1446: Email is daisy@mussa.com")
	void EmailOfRecord1446() {
		assertEquals("daisy@mussa.com", customers.get(1445).getEmail());
	}

	@Test
	@DisplayName("Record 1446: Web is http://www.daisymussa.com")
	void WebOfRecord1446() {
		assertEquals("http://www.daisymussa.com", customers.get(1445).getWeb());
	}
}
