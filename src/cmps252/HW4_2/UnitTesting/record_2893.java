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
class Record_2893 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2893: FirstName is Millard")
	void FirstNameOfRecord2893() {
		assertEquals("Millard", customers.get(2892).getFirstName());
	}

	@Test
	@DisplayName("Record 2893: LastName is Winsley")
	void LastNameOfRecord2893() {
		assertEquals("Winsley", customers.get(2892).getLastName());
	}

	@Test
	@DisplayName("Record 2893: Company is Dyson, Victoria L Esq")
	void CompanyOfRecord2893() {
		assertEquals("Dyson, Victoria L Esq", customers.get(2892).getCompany());
	}

	@Test
	@DisplayName("Record 2893: Address is 730 17th St")
	void AddressOfRecord2893() {
		assertEquals("730 17th St", customers.get(2892).getAddress());
	}

	@Test
	@DisplayName("Record 2893: City is Denver")
	void CityOfRecord2893() {
		assertEquals("Denver", customers.get(2892).getCity());
	}

	@Test
	@DisplayName("Record 2893: County is Denver")
	void CountyOfRecord2893() {
		assertEquals("Denver", customers.get(2892).getCounty());
	}

	@Test
	@DisplayName("Record 2893: State is CO")
	void StateOfRecord2893() {
		assertEquals("CO", customers.get(2892).getState());
	}

	@Test
	@DisplayName("Record 2893: ZIP is 80202")
	void ZIPOfRecord2893() {
		assertEquals("80202", customers.get(2892).getZIP());
	}

	@Test
	@DisplayName("Record 2893: Phone is 303-572-6276")
	void PhoneOfRecord2893() {
		assertEquals("303-572-6276", customers.get(2892).getPhone());
	}

	@Test
	@DisplayName("Record 2893: Fax is 303-572-2025")
	void FaxOfRecord2893() {
		assertEquals("303-572-2025", customers.get(2892).getFax());
	}

	@Test
	@DisplayName("Record 2893: Email is millard@winsley.com")
	void EmailOfRecord2893() {
		assertEquals("millard@winsley.com", customers.get(2892).getEmail());
	}

	@Test
	@DisplayName("Record 2893: Web is http://www.millardwinsley.com")
	void WebOfRecord2893() {
		assertEquals("http://www.millardwinsley.com", customers.get(2892).getWeb());
	}
}
