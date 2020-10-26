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

@Tag("49")
class Record_4432 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4432: FirstName is Madonna")
	void FirstNameOfRecord4432() {
		assertEquals("Madonna", customers.get(4431).getFirstName());
	}

	@Test
	@DisplayName("Record 4432: LastName is Mantyla")
	void LastNameOfRecord4432() {
		assertEquals("Mantyla", customers.get(4431).getLastName());
	}

	@Test
	@DisplayName("Record 4432: Company is Resin Technologies Inc")
	void CompanyOfRecord4432() {
		assertEquals("Resin Technologies Inc", customers.get(4431).getCompany());
	}

	@Test
	@DisplayName("Record 4432: Address is 10101 Garden Rd")
	void AddressOfRecord4432() {
		assertEquals("10101 Garden Rd", customers.get(4431).getAddress());
	}

	@Test
	@DisplayName("Record 4432: City is Monclova")
	void CityOfRecord4432() {
		assertEquals("Monclova", customers.get(4431).getCity());
	}

	@Test
	@DisplayName("Record 4432: County is Lucas")
	void CountyOfRecord4432() {
		assertEquals("Lucas", customers.get(4431).getCounty());
	}

	@Test
	@DisplayName("Record 4432: State is OH")
	void StateOfRecord4432() {
		assertEquals("OH", customers.get(4431).getState());
	}

	@Test
	@DisplayName("Record 4432: ZIP is 43542")
	void ZIPOfRecord4432() {
		assertEquals("43542", customers.get(4431).getZIP());
	}

	@Test
	@DisplayName("Record 4432: Phone is 419-867-2002")
	void PhoneOfRecord4432() {
		assertEquals("419-867-2002", customers.get(4431).getPhone());
	}

	@Test
	@DisplayName("Record 4432: Fax is 419-867-4651")
	void FaxOfRecord4432() {
		assertEquals("419-867-4651", customers.get(4431).getFax());
	}

	@Test
	@DisplayName("Record 4432: Email is madonna@mantyla.com")
	void EmailOfRecord4432() {
		assertEquals("madonna@mantyla.com", customers.get(4431).getEmail());
	}

	@Test
	@DisplayName("Record 4432: Web is http://www.madonnamantyla.com")
	void WebOfRecord4432() {
		assertEquals("http://www.madonnamantyla.com", customers.get(4431).getWeb());
	}
}
