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
class Record_4716 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4716: FirstName is Nina")
	void FirstNameOfRecord4716() {
		assertEquals("Nina", customers.get(4715).getFirstName());
	}

	@Test
	@DisplayName("Record 4716: LastName is Penfield")
	void LastNameOfRecord4716() {
		assertEquals("Penfield", customers.get(4715).getLastName());
	}

	@Test
	@DisplayName("Record 4716: Company is Gradstone & Luskin")
	void CompanyOfRecord4716() {
		assertEquals("Gradstone & Luskin", customers.get(4715).getCompany());
	}

	@Test
	@DisplayName("Record 4716: Address is 1673 Route 9")
	void AddressOfRecord4716() {
		assertEquals("1673 Route 9", customers.get(4715).getAddress());
	}

	@Test
	@DisplayName("Record 4716: City is Clifton Park")
	void CityOfRecord4716() {
		assertEquals("Clifton Park", customers.get(4715).getCity());
	}

	@Test
	@DisplayName("Record 4716: County is Saratoga")
	void CountyOfRecord4716() {
		assertEquals("Saratoga", customers.get(4715).getCounty());
	}

	@Test
	@DisplayName("Record 4716: State is NY")
	void StateOfRecord4716() {
		assertEquals("NY", customers.get(4715).getState());
	}

	@Test
	@DisplayName("Record 4716: ZIP is 12065")
	void ZIPOfRecord4716() {
		assertEquals("12065", customers.get(4715).getZIP());
	}

	@Test
	@DisplayName("Record 4716: Phone is 518-383-7227")
	void PhoneOfRecord4716() {
		assertEquals("518-383-7227", customers.get(4715).getPhone());
	}

	@Test
	@DisplayName("Record 4716: Fax is 518-383-9919")
	void FaxOfRecord4716() {
		assertEquals("518-383-9919", customers.get(4715).getFax());
	}

	@Test
	@DisplayName("Record 4716: Email is nina@penfield.com")
	void EmailOfRecord4716() {
		assertEquals("nina@penfield.com", customers.get(4715).getEmail());
	}

	@Test
	@DisplayName("Record 4716: Web is http://www.ninapenfield.com")
	void WebOfRecord4716() {
		assertEquals("http://www.ninapenfield.com", customers.get(4715).getWeb());
	}
}
