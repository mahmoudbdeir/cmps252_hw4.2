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

@Tag("44")
class Record_2536 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2536: FirstName is Therese")
	void FirstNameOfRecord2536() {
		assertEquals("Therese", customers.get(2535).getFirstName());
	}

	@Test
	@DisplayName("Record 2536: LastName is Rysig")
	void LastNameOfRecord2536() {
		assertEquals("Rysig", customers.get(2535).getLastName());
	}

	@Test
	@DisplayName("Record 2536: Company is Freedman, Paul B Cpa")
	void CompanyOfRecord2536() {
		assertEquals("Freedman, Paul B Cpa", customers.get(2535).getCompany());
	}

	@Test
	@DisplayName("Record 2536: Address is 30 Spring Mill Dr")
	void AddressOfRecord2536() {
		assertEquals("30 Spring Mill Dr", customers.get(2535).getAddress());
	}

	@Test
	@DisplayName("Record 2536: City is Malvern")
	void CityOfRecord2536() {
		assertEquals("Malvern", customers.get(2535).getCity());
	}

	@Test
	@DisplayName("Record 2536: County is Chester")
	void CountyOfRecord2536() {
		assertEquals("Chester", customers.get(2535).getCounty());
	}

	@Test
	@DisplayName("Record 2536: State is PA")
	void StateOfRecord2536() {
		assertEquals("PA", customers.get(2535).getState());
	}

	@Test
	@DisplayName("Record 2536: ZIP is 19355")
	void ZIPOfRecord2536() {
		assertEquals("19355", customers.get(2535).getZIP());
	}

	@Test
	@DisplayName("Record 2536: Phone is 610-889-1914")
	void PhoneOfRecord2536() {
		assertEquals("610-889-1914", customers.get(2535).getPhone());
	}

	@Test
	@DisplayName("Record 2536: Fax is 610-889-6655")
	void FaxOfRecord2536() {
		assertEquals("610-889-6655", customers.get(2535).getFax());
	}

	@Test
	@DisplayName("Record 2536: Email is therese@rysig.com")
	void EmailOfRecord2536() {
		assertEquals("therese@rysig.com", customers.get(2535).getEmail());
	}

	@Test
	@DisplayName("Record 2536: Web is http://www.thereserysig.com")
	void WebOfRecord2536() {
		assertEquals("http://www.thereserysig.com", customers.get(2535).getWeb());
	}
}
