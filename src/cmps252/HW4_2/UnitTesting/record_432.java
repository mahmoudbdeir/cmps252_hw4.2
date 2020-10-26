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

@Tag("41")
class Record_432 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 432: FirstName is Traci")
	void FirstNameOfRecord432() {
		assertEquals("Traci", customers.get(431).getFirstName());
	}

	@Test
	@DisplayName("Record 432: LastName is Hutch")
	void LastNameOfRecord432() {
		assertEquals("Hutch", customers.get(431).getLastName());
	}

	@Test
	@DisplayName("Record 432: Company is Miller Huggins Inc")
	void CompanyOfRecord432() {
		assertEquals("Miller Huggins Inc", customers.get(431).getCompany());
	}

	@Test
	@DisplayName("Record 432: Address is 48 Lehigh Ave")
	void AddressOfRecord432() {
		assertEquals("48 Lehigh Ave", customers.get(431).getAddress());
	}

	@Test
	@DisplayName("Record 432: City is Paterson")
	void CityOfRecord432() {
		assertEquals("Paterson", customers.get(431).getCity());
	}

	@Test
	@DisplayName("Record 432: County is Passaic")
	void CountyOfRecord432() {
		assertEquals("Passaic", customers.get(431).getCounty());
	}

	@Test
	@DisplayName("Record 432: State is NJ")
	void StateOfRecord432() {
		assertEquals("NJ", customers.get(431).getState());
	}

	@Test
	@DisplayName("Record 432: ZIP is 7503")
	void ZIPOfRecord432() {
		assertEquals("7503", customers.get(431).getZIP());
	}

	@Test
	@DisplayName("Record 432: Phone is 973-345-1409")
	void PhoneOfRecord432() {
		assertEquals("973-345-1409", customers.get(431).getPhone());
	}

	@Test
	@DisplayName("Record 432: Fax is 973-345-7761")
	void FaxOfRecord432() {
		assertEquals("973-345-7761", customers.get(431).getFax());
	}

	@Test
	@DisplayName("Record 432: Email is traci@hutch.com")
	void EmailOfRecord432() {
		assertEquals("traci@hutch.com", customers.get(431).getEmail());
	}

	@Test
	@DisplayName("Record 432: Web is http://www.tracihutch.com")
	void WebOfRecord432() {
		assertEquals("http://www.tracihutch.com", customers.get(431).getWeb());
	}
}
