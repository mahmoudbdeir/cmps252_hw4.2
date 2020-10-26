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

@Tag("38")
class Record_2869 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2869: FirstName is Kendra")
	void FirstNameOfRecord2869() {
		assertEquals("Kendra", customers.get(2868).getFirstName());
	}

	@Test
	@DisplayName("Record 2869: LastName is Salvemini")
	void LastNameOfRecord2869() {
		assertEquals("Salvemini", customers.get(2868).getLastName());
	}

	@Test
	@DisplayName("Record 2869: Company is Peridot Chemicals Of Nj Inc")
	void CompanyOfRecord2869() {
		assertEquals("Peridot Chemicals Of Nj Inc", customers.get(2868).getCompany());
	}

	@Test
	@DisplayName("Record 2869: Address is 5031 N 7th Ave")
	void AddressOfRecord2869() {
		assertEquals("5031 N 7th Ave", customers.get(2868).getAddress());
	}

	@Test
	@DisplayName("Record 2869: City is Phoenix")
	void CityOfRecord2869() {
		assertEquals("Phoenix", customers.get(2868).getCity());
	}

	@Test
	@DisplayName("Record 2869: County is Maricopa")
	void CountyOfRecord2869() {
		assertEquals("Maricopa", customers.get(2868).getCounty());
	}

	@Test
	@DisplayName("Record 2869: State is AZ")
	void StateOfRecord2869() {
		assertEquals("AZ", customers.get(2868).getState());
	}

	@Test
	@DisplayName("Record 2869: ZIP is 85013")
	void ZIPOfRecord2869() {
		assertEquals("85013", customers.get(2868).getZIP());
	}

	@Test
	@DisplayName("Record 2869: Phone is 602-277-0596")
	void PhoneOfRecord2869() {
		assertEquals("602-277-0596", customers.get(2868).getPhone());
	}

	@Test
	@DisplayName("Record 2869: Fax is 602-277-8064")
	void FaxOfRecord2869() {
		assertEquals("602-277-8064", customers.get(2868).getFax());
	}

	@Test
	@DisplayName("Record 2869: Email is kendra@salvemini.com")
	void EmailOfRecord2869() {
		assertEquals("kendra@salvemini.com", customers.get(2868).getEmail());
	}

	@Test
	@DisplayName("Record 2869: Web is http://www.kendrasalvemini.com")
	void WebOfRecord2869() {
		assertEquals("http://www.kendrasalvemini.com", customers.get(2868).getWeb());
	}
}
