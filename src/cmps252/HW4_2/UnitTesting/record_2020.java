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
class Record_2020 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2020: FirstName is Dane")
	void FirstNameOfRecord2020() {
		assertEquals("Dane", customers.get(2019).getFirstName());
	}

	@Test
	@DisplayName("Record 2020: LastName is Jobs")
	void LastNameOfRecord2020() {
		assertEquals("Jobs", customers.get(2019).getLastName());
	}

	@Test
	@DisplayName("Record 2020: Company is Stampings Of Minnesota Inc")
	void CompanyOfRecord2020() {
		assertEquals("Stampings Of Minnesota Inc", customers.get(2019).getCompany());
	}

	@Test
	@DisplayName("Record 2020: Address is 216 Congers Rd")
	void AddressOfRecord2020() {
		assertEquals("216 Congers Rd", customers.get(2019).getAddress());
	}

	@Test
	@DisplayName("Record 2020: City is New City")
	void CityOfRecord2020() {
		assertEquals("New City", customers.get(2019).getCity());
	}

	@Test
	@DisplayName("Record 2020: County is Rockland")
	void CountyOfRecord2020() {
		assertEquals("Rockland", customers.get(2019).getCounty());
	}

	@Test
	@DisplayName("Record 2020: State is NY")
	void StateOfRecord2020() {
		assertEquals("NY", customers.get(2019).getState());
	}

	@Test
	@DisplayName("Record 2020: ZIP is 10956")
	void ZIPOfRecord2020() {
		assertEquals("10956", customers.get(2019).getZIP());
	}

	@Test
	@DisplayName("Record 2020: Phone is 845-638-2364")
	void PhoneOfRecord2020() {
		assertEquals("845-638-2364", customers.get(2019).getPhone());
	}

	@Test
	@DisplayName("Record 2020: Fax is 845-638-9429")
	void FaxOfRecord2020() {
		assertEquals("845-638-9429", customers.get(2019).getFax());
	}

	@Test
	@DisplayName("Record 2020: Email is dane@jobs.com")
	void EmailOfRecord2020() {
		assertEquals("dane@jobs.com", customers.get(2019).getEmail());
	}

	@Test
	@DisplayName("Record 2020: Web is http://www.danejobs.com")
	void WebOfRecord2020() {
		assertEquals("http://www.danejobs.com", customers.get(2019).getWeb());
	}
}
