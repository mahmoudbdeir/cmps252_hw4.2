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

@Tag("48")
class Record_2443 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2443: FirstName is Hunter")
	void FirstNameOfRecord2443() {
		assertEquals("Hunter", customers.get(2442).getFirstName());
	}

	@Test
	@DisplayName("Record 2443: LastName is Capuchin")
	void LastNameOfRecord2443() {
		assertEquals("Capuchin", customers.get(2442).getLastName());
	}

	@Test
	@DisplayName("Record 2443: Company is Prudential Securities Inc")
	void CompanyOfRecord2443() {
		assertEquals("Prudential Securities Inc", customers.get(2442).getCompany());
	}

	@Test
	@DisplayName("Record 2443: Address is 50 Commerce Way")
	void AddressOfRecord2443() {
		assertEquals("50 Commerce Way", customers.get(2442).getAddress());
	}

	@Test
	@DisplayName("Record 2443: City is East Aurora")
	void CityOfRecord2443() {
		assertEquals("East Aurora", customers.get(2442).getCity());
	}

	@Test
	@DisplayName("Record 2443: County is Erie")
	void CountyOfRecord2443() {
		assertEquals("Erie", customers.get(2442).getCounty());
	}

	@Test
	@DisplayName("Record 2443: State is NY")
	void StateOfRecord2443() {
		assertEquals("NY", customers.get(2442).getState());
	}

	@Test
	@DisplayName("Record 2443: ZIP is 14052")
	void ZIPOfRecord2443() {
		assertEquals("14052", customers.get(2442).getZIP());
	}

	@Test
	@DisplayName("Record 2443: Phone is 716-652-6922")
	void PhoneOfRecord2443() {
		assertEquals("716-652-6922", customers.get(2442).getPhone());
	}

	@Test
	@DisplayName("Record 2443: Fax is 716-652-5451")
	void FaxOfRecord2443() {
		assertEquals("716-652-5451", customers.get(2442).getFax());
	}

	@Test
	@DisplayName("Record 2443: Email is hunter@capuchin.com")
	void EmailOfRecord2443() {
		assertEquals("hunter@capuchin.com", customers.get(2442).getEmail());
	}

	@Test
	@DisplayName("Record 2443: Web is http://www.huntercapuchin.com")
	void WebOfRecord2443() {
		assertEquals("http://www.huntercapuchin.com", customers.get(2442).getWeb());
	}
}
