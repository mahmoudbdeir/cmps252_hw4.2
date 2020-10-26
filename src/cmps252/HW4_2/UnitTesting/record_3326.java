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

@Tag("40")
class Record_3326 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3326: FirstName is Annette")
	void FirstNameOfRecord3326() {
		assertEquals("Annette", customers.get(3325).getFirstName());
	}

	@Test
	@DisplayName("Record 3326: LastName is Bern")
	void LastNameOfRecord3326() {
		assertEquals("Bern", customers.get(3325).getLastName());
	}

	@Test
	@DisplayName("Record 3326: Company is Natural Gas Pipeline Co Amer")
	void CompanyOfRecord3326() {
		assertEquals("Natural Gas Pipeline Co Amer", customers.get(3325).getCompany());
	}

	@Test
	@DisplayName("Record 3326: Address is 1418 Laurel St")
	void AddressOfRecord3326() {
		assertEquals("1418 Laurel St", customers.get(3325).getAddress());
	}

	@Test
	@DisplayName("Record 3326: City is Columbia")
	void CityOfRecord3326() {
		assertEquals("Columbia", customers.get(3325).getCity());
	}

	@Test
	@DisplayName("Record 3326: County is Richland")
	void CountyOfRecord3326() {
		assertEquals("Richland", customers.get(3325).getCounty());
	}

	@Test
	@DisplayName("Record 3326: State is SC")
	void StateOfRecord3326() {
		assertEquals("SC", customers.get(3325).getState());
	}

	@Test
	@DisplayName("Record 3326: ZIP is 29201")
	void ZIPOfRecord3326() {
		assertEquals("29201", customers.get(3325).getZIP());
	}

	@Test
	@DisplayName("Record 3326: Phone is 803-252-5811")
	void PhoneOfRecord3326() {
		assertEquals("803-252-5811", customers.get(3325).getPhone());
	}

	@Test
	@DisplayName("Record 3326: Fax is 803-252-1372")
	void FaxOfRecord3326() {
		assertEquals("803-252-1372", customers.get(3325).getFax());
	}

	@Test
	@DisplayName("Record 3326: Email is annette@bern.com")
	void EmailOfRecord3326() {
		assertEquals("annette@bern.com", customers.get(3325).getEmail());
	}

	@Test
	@DisplayName("Record 3326: Web is http://www.annettebern.com")
	void WebOfRecord3326() {
		assertEquals("http://www.annettebern.com", customers.get(3325).getWeb());
	}
}
