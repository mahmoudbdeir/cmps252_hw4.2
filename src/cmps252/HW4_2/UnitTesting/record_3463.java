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

@Tag("32")
class Record_3463 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3463: FirstName is Janet")
	void FirstNameOfRecord3463() {
		assertEquals("Janet", customers.get(3462).getFirstName());
	}

	@Test
	@DisplayName("Record 3463: LastName is Crook")
	void LastNameOfRecord3463() {
		assertEquals("Crook", customers.get(3462).getLastName());
	}

	@Test
	@DisplayName("Record 3463: Company is Consolidated Papers Inc")
	void CompanyOfRecord3463() {
		assertEquals("Consolidated Papers Inc", customers.get(3462).getCompany());
	}

	@Test
	@DisplayName("Record 3463: Address is Andover Rd")
	void AddressOfRecord3463() {
		assertEquals("Andover Rd", customers.get(3462).getAddress());
	}

	@Test
	@DisplayName("Record 3463: City is Wellsville")
	void CityOfRecord3463() {
		assertEquals("Wellsville", customers.get(3462).getCity());
	}

	@Test
	@DisplayName("Record 3463: County is Allegany")
	void CountyOfRecord3463() {
		assertEquals("Allegany", customers.get(3462).getCounty());
	}

	@Test
	@DisplayName("Record 3463: State is NY")
	void StateOfRecord3463() {
		assertEquals("NY", customers.get(3462).getState());
	}

	@Test
	@DisplayName("Record 3463: ZIP is 14895")
	void ZIPOfRecord3463() {
		assertEquals("14895", customers.get(3462).getZIP());
	}

	@Test
	@DisplayName("Record 3463: Phone is 585-593-7634")
	void PhoneOfRecord3463() {
		assertEquals("585-593-7634", customers.get(3462).getPhone());
	}

	@Test
	@DisplayName("Record 3463: Fax is 585-593-2962")
	void FaxOfRecord3463() {
		assertEquals("585-593-2962", customers.get(3462).getFax());
	}

	@Test
	@DisplayName("Record 3463: Email is janet@crook.com")
	void EmailOfRecord3463() {
		assertEquals("janet@crook.com", customers.get(3462).getEmail());
	}

	@Test
	@DisplayName("Record 3463: Web is http://www.janetcrook.com")
	void WebOfRecord3463() {
		assertEquals("http://www.janetcrook.com", customers.get(3462).getWeb());
	}
}
