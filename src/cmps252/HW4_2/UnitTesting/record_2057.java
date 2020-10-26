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

@Tag("30")
class Record_2057 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2057: FirstName is Lisa")
	void FirstNameOfRecord2057() {
		assertEquals("Lisa", customers.get(2056).getFirstName());
	}

	@Test
	@DisplayName("Record 2057: LastName is Sollock")
	void LastNameOfRecord2057() {
		assertEquals("Sollock", customers.get(2056).getLastName());
	}

	@Test
	@DisplayName("Record 2057: Company is Marin Cell U Phone")
	void CompanyOfRecord2057() {
		assertEquals("Marin Cell U Phone", customers.get(2056).getCompany());
	}

	@Test
	@DisplayName("Record 2057: Address is 206 N 3rd St")
	void AddressOfRecord2057() {
		assertEquals("206 N 3rd St", customers.get(2056).getAddress());
	}

	@Test
	@DisplayName("Record 2057: City is Minneapolis")
	void CityOfRecord2057() {
		assertEquals("Minneapolis", customers.get(2056).getCity());
	}

	@Test
	@DisplayName("Record 2057: County is Hennepin")
	void CountyOfRecord2057() {
		assertEquals("Hennepin", customers.get(2056).getCounty());
	}

	@Test
	@DisplayName("Record 2057: State is MN")
	void StateOfRecord2057() {
		assertEquals("MN", customers.get(2056).getState());
	}

	@Test
	@DisplayName("Record 2057: ZIP is 55401")
	void ZIPOfRecord2057() {
		assertEquals("55401", customers.get(2056).getZIP());
	}

	@Test
	@DisplayName("Record 2057: Phone is 612-333-0321")
	void PhoneOfRecord2057() {
		assertEquals("612-333-0321", customers.get(2056).getPhone());
	}

	@Test
	@DisplayName("Record 2057: Fax is 612-333-7008")
	void FaxOfRecord2057() {
		assertEquals("612-333-7008", customers.get(2056).getFax());
	}

	@Test
	@DisplayName("Record 2057: Email is lisa@sollock.com")
	void EmailOfRecord2057() {
		assertEquals("lisa@sollock.com", customers.get(2056).getEmail());
	}

	@Test
	@DisplayName("Record 2057: Web is http://www.lisasollock.com")
	void WebOfRecord2057() {
		assertEquals("http://www.lisasollock.com", customers.get(2056).getWeb());
	}
}
