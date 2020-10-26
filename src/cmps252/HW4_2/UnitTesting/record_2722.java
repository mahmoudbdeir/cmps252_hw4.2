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

@Tag("34")
class Record_2722 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2722: FirstName is Rochelle")
	void FirstNameOfRecord2722() {
		assertEquals("Rochelle", customers.get(2721).getFirstName());
	}

	@Test
	@DisplayName("Record 2722: LastName is Muskus")
	void LastNameOfRecord2722() {
		assertEquals("Muskus", customers.get(2721).getLastName());
	}

	@Test
	@DisplayName("Record 2722: Company is Days Inn")
	void CompanyOfRecord2722() {
		assertEquals("Days Inn", customers.get(2721).getCompany());
	}

	@Test
	@DisplayName("Record 2722: Address is 50 W Skippack Pike")
	void AddressOfRecord2722() {
		assertEquals("50 W Skippack Pike", customers.get(2721).getAddress());
	}

	@Test
	@DisplayName("Record 2722: City is Ambler")
	void CityOfRecord2722() {
		assertEquals("Ambler", customers.get(2721).getCity());
	}

	@Test
	@DisplayName("Record 2722: County is Montgomery")
	void CountyOfRecord2722() {
		assertEquals("Montgomery", customers.get(2721).getCounty());
	}

	@Test
	@DisplayName("Record 2722: State is PA")
	void StateOfRecord2722() {
		assertEquals("PA", customers.get(2721).getState());
	}

	@Test
	@DisplayName("Record 2722: ZIP is 19002")
	void ZIPOfRecord2722() {
		assertEquals("19002", customers.get(2721).getZIP());
	}

	@Test
	@DisplayName("Record 2722: Phone is 215-542-0749")
	void PhoneOfRecord2722() {
		assertEquals("215-542-0749", customers.get(2721).getPhone());
	}

	@Test
	@DisplayName("Record 2722: Fax is 215-542-7153")
	void FaxOfRecord2722() {
		assertEquals("215-542-7153", customers.get(2721).getFax());
	}

	@Test
	@DisplayName("Record 2722: Email is rochelle@muskus.com")
	void EmailOfRecord2722() {
		assertEquals("rochelle@muskus.com", customers.get(2721).getEmail());
	}

	@Test
	@DisplayName("Record 2722: Web is http://www.rochellemuskus.com")
	void WebOfRecord2722() {
		assertEquals("http://www.rochellemuskus.com", customers.get(2721).getWeb());
	}
}
