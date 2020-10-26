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

@Tag("10")
class Record_2602 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2602: FirstName is Sanford")
	void FirstNameOfRecord2602() {
		assertEquals("Sanford", customers.get(2601).getFirstName());
	}

	@Test
	@DisplayName("Record 2602: LastName is Morgas")
	void LastNameOfRecord2602() {
		assertEquals("Morgas", customers.get(2601).getLastName());
	}

	@Test
	@DisplayName("Record 2602: Company is Haveman Pharmacy & Gifts")
	void CompanyOfRecord2602() {
		assertEquals("Haveman Pharmacy & Gifts", customers.get(2601).getCompany());
	}

	@Test
	@DisplayName("Record 2602: Address is 1310 Flagler Dr")
	void AddressOfRecord2602() {
		assertEquals("1310 Flagler Dr", customers.get(2601).getAddress());
	}

	@Test
	@DisplayName("Record 2602: City is Mamaroneck")
	void CityOfRecord2602() {
		assertEquals("Mamaroneck", customers.get(2601).getCity());
	}

	@Test
	@DisplayName("Record 2602: County is Westchester")
	void CountyOfRecord2602() {
		assertEquals("Westchester", customers.get(2601).getCounty());
	}

	@Test
	@DisplayName("Record 2602: State is NY")
	void StateOfRecord2602() {
		assertEquals("NY", customers.get(2601).getState());
	}

	@Test
	@DisplayName("Record 2602: ZIP is 10543")
	void ZIPOfRecord2602() {
		assertEquals("10543", customers.get(2601).getZIP());
	}

	@Test
	@DisplayName("Record 2602: Phone is 914-698-5434")
	void PhoneOfRecord2602() {
		assertEquals("914-698-5434", customers.get(2601).getPhone());
	}

	@Test
	@DisplayName("Record 2602: Fax is 914-698-3865")
	void FaxOfRecord2602() {
		assertEquals("914-698-3865", customers.get(2601).getFax());
	}

	@Test
	@DisplayName("Record 2602: Email is sanford@morgas.com")
	void EmailOfRecord2602() {
		assertEquals("sanford@morgas.com", customers.get(2601).getEmail());
	}

	@Test
	@DisplayName("Record 2602: Web is http://www.sanfordmorgas.com")
	void WebOfRecord2602() {
		assertEquals("http://www.sanfordmorgas.com", customers.get(2601).getWeb());
	}
}
