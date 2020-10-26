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

@Tag("35")
class Record_2907 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2907: FirstName is Jamal")
	void FirstNameOfRecord2907() {
		assertEquals("Jamal", customers.get(2906).getFirstName());
	}

	@Test
	@DisplayName("Record 2907: LastName is Wicke")
	void LastNameOfRecord2907() {
		assertEquals("Wicke", customers.get(2906).getLastName());
	}

	@Test
	@DisplayName("Record 2907: Company is French, Joseph C Esq")
	void CompanyOfRecord2907() {
		assertEquals("French, Joseph C Esq", customers.get(2906).getCompany());
	}

	@Test
	@DisplayName("Record 2907: Address is 1946 N 13th St")
	void AddressOfRecord2907() {
		assertEquals("1946 N 13th St", customers.get(2906).getAddress());
	}

	@Test
	@DisplayName("Record 2907: City is Toledo")
	void CityOfRecord2907() {
		assertEquals("Toledo", customers.get(2906).getCity());
	}

	@Test
	@DisplayName("Record 2907: County is Lucas")
	void CountyOfRecord2907() {
		assertEquals("Lucas", customers.get(2906).getCounty());
	}

	@Test
	@DisplayName("Record 2907: State is OH")
	void StateOfRecord2907() {
		assertEquals("OH", customers.get(2906).getState());
	}

	@Test
	@DisplayName("Record 2907: ZIP is 43624")
	void ZIPOfRecord2907() {
		assertEquals("43624", customers.get(2906).getZIP());
	}

	@Test
	@DisplayName("Record 2907: Phone is 419-241-3579")
	void PhoneOfRecord2907() {
		assertEquals("419-241-3579", customers.get(2906).getPhone());
	}

	@Test
	@DisplayName("Record 2907: Fax is 419-241-1134")
	void FaxOfRecord2907() {
		assertEquals("419-241-1134", customers.get(2906).getFax());
	}

	@Test
	@DisplayName("Record 2907: Email is jamal@wicke.com")
	void EmailOfRecord2907() {
		assertEquals("jamal@wicke.com", customers.get(2906).getEmail());
	}

	@Test
	@DisplayName("Record 2907: Web is http://www.jamalwicke.com")
	void WebOfRecord2907() {
		assertEquals("http://www.jamalwicke.com", customers.get(2906).getWeb());
	}
}
