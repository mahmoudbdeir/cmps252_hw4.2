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

@Tag("16")
class Record_145 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 145: FirstName is Irwin")
	void FirstNameOfRecord145() {
		assertEquals("Irwin", customers.get(144).getFirstName());
	}

	@Test
	@DisplayName("Record 145: LastName is Nacci")
	void LastNameOfRecord145() {
		assertEquals("Nacci", customers.get(144).getLastName());
	}

	@Test
	@DisplayName("Record 145: Company is R B R Meat Co Inc")
	void CompanyOfRecord145() {
		assertEquals("R B R Meat Co Inc", customers.get(144).getCompany());
	}

	@Test
	@DisplayName("Record 145: Address is 2609 Dearborn St")
	void AddressOfRecord145() {
		assertEquals("2609 Dearborn St", customers.get(144).getAddress());
	}

	@Test
	@DisplayName("Record 145: City is Easton")
	void CityOfRecord145() {
		assertEquals("Easton", customers.get(144).getCity());
	}

	@Test
	@DisplayName("Record 145: County is Northampton")
	void CountyOfRecord145() {
		assertEquals("Northampton", customers.get(144).getCounty());
	}

	@Test
	@DisplayName("Record 145: State is PA")
	void StateOfRecord145() {
		assertEquals("PA", customers.get(144).getState());
	}

	@Test
	@DisplayName("Record 145: ZIP is 18045")
	void ZIPOfRecord145() {
		assertEquals("18045", customers.get(144).getZIP());
	}

	@Test
	@DisplayName("Record 145: Phone is 610-258-3633")
	void PhoneOfRecord145() {
		assertEquals("610-258-3633", customers.get(144).getPhone());
	}

	@Test
	@DisplayName("Record 145: Fax is 610-258-4137")
	void FaxOfRecord145() {
		assertEquals("610-258-4137", customers.get(144).getFax());
	}

	@Test
	@DisplayName("Record 145: Email is irwin@nacci.com")
	void EmailOfRecord145() {
		assertEquals("irwin@nacci.com", customers.get(144).getEmail());
	}

	@Test
	@DisplayName("Record 145: Web is http://www.irwinnacci.com")
	void WebOfRecord145() {
		assertEquals("http://www.irwinnacci.com", customers.get(144).getWeb());
	}
}
