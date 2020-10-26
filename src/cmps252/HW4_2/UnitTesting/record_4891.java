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
class Record_4891 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4891: FirstName is Hoyt")
	void FirstNameOfRecord4891() {
		assertEquals("Hoyt", customers.get(4890).getFirstName());
	}

	@Test
	@DisplayName("Record 4891: LastName is Courchesne")
	void LastNameOfRecord4891() {
		assertEquals("Courchesne", customers.get(4890).getLastName());
	}

	@Test
	@DisplayName("Record 4891: Company is Master Remodeling Inc")
	void CompanyOfRecord4891() {
		assertEquals("Master Remodeling Inc", customers.get(4890).getCompany());
	}

	@Test
	@DisplayName("Record 4891: Address is 1402 Us Highway 395n N")
	void AddressOfRecord4891() {
		assertEquals("1402 Us Highway 395n N", customers.get(4890).getAddress());
	}

	@Test
	@DisplayName("Record 4891: City is Gardnerville")
	void CityOfRecord4891() {
		assertEquals("Gardnerville", customers.get(4890).getCity());
	}

	@Test
	@DisplayName("Record 4891: County is Douglas")
	void CountyOfRecord4891() {
		assertEquals("Douglas", customers.get(4890).getCounty());
	}

	@Test
	@DisplayName("Record 4891: State is NV")
	void StateOfRecord4891() {
		assertEquals("NV", customers.get(4890).getState());
	}

	@Test
	@DisplayName("Record 4891: ZIP is 89410")
	void ZIPOfRecord4891() {
		assertEquals("89410", customers.get(4890).getZIP());
	}

	@Test
	@DisplayName("Record 4891: Phone is 775-782-4504")
	void PhoneOfRecord4891() {
		assertEquals("775-782-4504", customers.get(4890).getPhone());
	}

	@Test
	@DisplayName("Record 4891: Fax is 775-782-3784")
	void FaxOfRecord4891() {
		assertEquals("775-782-3784", customers.get(4890).getFax());
	}

	@Test
	@DisplayName("Record 4891: Email is hoyt@courchesne.com")
	void EmailOfRecord4891() {
		assertEquals("hoyt@courchesne.com", customers.get(4890).getEmail());
	}

	@Test
	@DisplayName("Record 4891: Web is http://www.hoytcourchesne.com")
	void WebOfRecord4891() {
		assertEquals("http://www.hoytcourchesne.com", customers.get(4890).getWeb());
	}
}
