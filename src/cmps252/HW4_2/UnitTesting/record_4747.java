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
class Record_4747 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4747: FirstName is Jane")
	void FirstNameOfRecord4747() {
		assertEquals("Jane", customers.get(4746).getFirstName());
	}

	@Test
	@DisplayName("Record 4747: LastName is Wetsell")
	void LastNameOfRecord4747() {
		assertEquals("Wetsell", customers.get(4746).getLastName());
	}

	@Test
	@DisplayName("Record 4747: Company is Baker Batteries")
	void CompanyOfRecord4747() {
		assertEquals("Baker Batteries", customers.get(4746).getCompany());
	}

	@Test
	@DisplayName("Record 4747: Address is 338 Sw 6th St")
	void AddressOfRecord4747() {
		assertEquals("338 Sw 6th St", customers.get(4746).getAddress());
	}

	@Test
	@DisplayName("Record 4747: City is Des Moines")
	void CityOfRecord4747() {
		assertEquals("Des Moines", customers.get(4746).getCity());
	}

	@Test
	@DisplayName("Record 4747: County is Polk")
	void CountyOfRecord4747() {
		assertEquals("Polk", customers.get(4746).getCounty());
	}

	@Test
	@DisplayName("Record 4747: State is IA")
	void StateOfRecord4747() {
		assertEquals("IA", customers.get(4746).getState());
	}

	@Test
	@DisplayName("Record 4747: ZIP is 50309")
	void ZIPOfRecord4747() {
		assertEquals("50309", customers.get(4746).getZIP());
	}

	@Test
	@DisplayName("Record 4747: Phone is 515-243-5930")
	void PhoneOfRecord4747() {
		assertEquals("515-243-5930", customers.get(4746).getPhone());
	}

	@Test
	@DisplayName("Record 4747: Fax is 515-243-6512")
	void FaxOfRecord4747() {
		assertEquals("515-243-6512", customers.get(4746).getFax());
	}

	@Test
	@DisplayName("Record 4747: Email is jane@wetsell.com")
	void EmailOfRecord4747() {
		assertEquals("jane@wetsell.com", customers.get(4746).getEmail());
	}

	@Test
	@DisplayName("Record 4747: Web is http://www.janewetsell.com")
	void WebOfRecord4747() {
		assertEquals("http://www.janewetsell.com", customers.get(4746).getWeb());
	}
}
