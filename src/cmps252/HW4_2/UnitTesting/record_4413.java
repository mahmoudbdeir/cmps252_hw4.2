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

@Tag("19")
class Record_4413 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4413: FirstName is Joanna")
	void FirstNameOfRecord4413() {
		assertEquals("Joanna", customers.get(4412).getFirstName());
	}

	@Test
	@DisplayName("Record 4413: LastName is Churner")
	void LastNameOfRecord4413() {
		assertEquals("Churner", customers.get(4412).getLastName());
	}

	@Test
	@DisplayName("Record 4413: Company is Levy, Kenneth W Esq")
	void CompanyOfRecord4413() {
		assertEquals("Levy, Kenneth W Esq", customers.get(4412).getCompany());
	}

	@Test
	@DisplayName("Record 4413: Address is 77 N Washington St  #-9")
	void AddressOfRecord4413() {
		assertEquals("77 N Washington St  #-9", customers.get(4412).getAddress());
	}

	@Test
	@DisplayName("Record 4413: City is Boston")
	void CityOfRecord4413() {
		assertEquals("Boston", customers.get(4412).getCity());
	}

	@Test
	@DisplayName("Record 4413: County is Suffolk")
	void CountyOfRecord4413() {
		assertEquals("Suffolk", customers.get(4412).getCounty());
	}

	@Test
	@DisplayName("Record 4413: State is MA")
	void StateOfRecord4413() {
		assertEquals("MA", customers.get(4412).getState());
	}

	@Test
	@DisplayName("Record 4413: ZIP is 2114")
	void ZIPOfRecord4413() {
		assertEquals("2114", customers.get(4412).getZIP());
	}

	@Test
	@DisplayName("Record 4413: Phone is 617-367-2485")
	void PhoneOfRecord4413() {
		assertEquals("617-367-2485", customers.get(4412).getPhone());
	}

	@Test
	@DisplayName("Record 4413: Fax is 617-367-8069")
	void FaxOfRecord4413() {
		assertEquals("617-367-8069", customers.get(4412).getFax());
	}

	@Test
	@DisplayName("Record 4413: Email is joanna@churner.com")
	void EmailOfRecord4413() {
		assertEquals("joanna@churner.com", customers.get(4412).getEmail());
	}

	@Test
	@DisplayName("Record 4413: Web is http://www.joannachurner.com")
	void WebOfRecord4413() {
		assertEquals("http://www.joannachurner.com", customers.get(4412).getWeb());
	}
}
