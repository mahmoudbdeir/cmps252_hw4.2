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

@Tag("37")
class Record_2291 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2291: FirstName is Burton")
	void FirstNameOfRecord2291() {
		assertEquals("Burton", customers.get(2290).getFirstName());
	}

	@Test
	@DisplayName("Record 2291: LastName is Conard")
	void LastNameOfRecord2291() {
		assertEquals("Conard", customers.get(2290).getLastName());
	}

	@Test
	@DisplayName("Record 2291: Company is Melinda Holden Photography")
	void CompanyOfRecord2291() {
		assertEquals("Melinda Holden Photography", customers.get(2290).getCompany());
	}

	@Test
	@DisplayName("Record 2291: Address is 4401 Lefferson Rd")
	void AddressOfRecord2291() {
		assertEquals("4401 Lefferson Rd", customers.get(2290).getAddress());
	}

	@Test
	@DisplayName("Record 2291: City is Middletown")
	void CityOfRecord2291() {
		assertEquals("Middletown", customers.get(2290).getCity());
	}

	@Test
	@DisplayName("Record 2291: County is Butler")
	void CountyOfRecord2291() {
		assertEquals("Butler", customers.get(2290).getCounty());
	}

	@Test
	@DisplayName("Record 2291: State is OH")
	void StateOfRecord2291() {
		assertEquals("OH", customers.get(2290).getState());
	}

	@Test
	@DisplayName("Record 2291: ZIP is 45044")
	void ZIPOfRecord2291() {
		assertEquals("45044", customers.get(2290).getZIP());
	}

	@Test
	@DisplayName("Record 2291: Phone is 513-424-1718")
	void PhoneOfRecord2291() {
		assertEquals("513-424-1718", customers.get(2290).getPhone());
	}

	@Test
	@DisplayName("Record 2291: Fax is 513-424-9895")
	void FaxOfRecord2291() {
		assertEquals("513-424-9895", customers.get(2290).getFax());
	}

	@Test
	@DisplayName("Record 2291: Email is burton@conard.com")
	void EmailOfRecord2291() {
		assertEquals("burton@conard.com", customers.get(2290).getEmail());
	}

	@Test
	@DisplayName("Record 2291: Web is http://www.burtonconard.com")
	void WebOfRecord2291() {
		assertEquals("http://www.burtonconard.com", customers.get(2290).getWeb());
	}
}
