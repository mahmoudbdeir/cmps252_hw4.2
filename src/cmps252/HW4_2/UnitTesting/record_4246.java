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

@Tag("24")
class Record_4246 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4246: FirstName is Jacqueline")
	void FirstNameOfRecord4246() {
		assertEquals("Jacqueline", customers.get(4245).getFirstName());
	}

	@Test
	@DisplayName("Record 4246: LastName is Koralewski")
	void LastNameOfRecord4246() {
		assertEquals("Koralewski", customers.get(4245).getLastName());
	}

	@Test
	@DisplayName("Record 4246: Company is Rogers Jewelers")
	void CompanyOfRecord4246() {
		assertEquals("Rogers Jewelers", customers.get(4245).getCompany());
	}

	@Test
	@DisplayName("Record 4246: Address is Box #-2440")
	void AddressOfRecord4246() {
		assertEquals("Box #-2440", customers.get(4245).getAddress());
	}

	@Test
	@DisplayName("Record 4246: City is Eugene")
	void CityOfRecord4246() {
		assertEquals("Eugene", customers.get(4245).getCity());
	}

	@Test
	@DisplayName("Record 4246: County is Lane")
	void CountyOfRecord4246() {
		assertEquals("Lane", customers.get(4245).getCounty());
	}

	@Test
	@DisplayName("Record 4246: State is OR")
	void StateOfRecord4246() {
		assertEquals("OR", customers.get(4245).getState());
	}

	@Test
	@DisplayName("Record 4246: ZIP is 97402")
	void ZIPOfRecord4246() {
		assertEquals("97402", customers.get(4245).getZIP());
	}

	@Test
	@DisplayName("Record 4246: Phone is 541-345-0286")
	void PhoneOfRecord4246() {
		assertEquals("541-345-0286", customers.get(4245).getPhone());
	}

	@Test
	@DisplayName("Record 4246: Fax is 541-345-7782")
	void FaxOfRecord4246() {
		assertEquals("541-345-7782", customers.get(4245).getFax());
	}

	@Test
	@DisplayName("Record 4246: Email is jacqueline@koralewski.com")
	void EmailOfRecord4246() {
		assertEquals("jacqueline@koralewski.com", customers.get(4245).getEmail());
	}

	@Test
	@DisplayName("Record 4246: Web is http://www.jacquelinekoralewski.com")
	void WebOfRecord4246() {
		assertEquals("http://www.jacquelinekoralewski.com", customers.get(4245).getWeb());
	}
}
