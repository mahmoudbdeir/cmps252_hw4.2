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

@Tag("25")
class Record_4148 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4148: FirstName is Ina")
	void FirstNameOfRecord4148() {
		assertEquals("Ina", customers.get(4147).getFirstName());
	}

	@Test
	@DisplayName("Record 4148: LastName is Mcauley")
	void LastNameOfRecord4148() {
		assertEquals("Mcauley", customers.get(4147).getLastName());
	}

	@Test
	@DisplayName("Record 4148: Company is Hilton At Walt Disney Wld Vlg")
	void CompanyOfRecord4148() {
		assertEquals("Hilton At Walt Disney Wld Vlg", customers.get(4147).getCompany());
	}

	@Test
	@DisplayName("Record 4148: Address is 1527 62nd St")
	void AddressOfRecord4148() {
		assertEquals("1527 62nd St", customers.get(4147).getAddress());
	}

	@Test
	@DisplayName("Record 4148: City is Brooklyn")
	void CityOfRecord4148() {
		assertEquals("Brooklyn", customers.get(4147).getCity());
	}

	@Test
	@DisplayName("Record 4148: County is Kings")
	void CountyOfRecord4148() {
		assertEquals("Kings", customers.get(4147).getCounty());
	}

	@Test
	@DisplayName("Record 4148: State is NY")
	void StateOfRecord4148() {
		assertEquals("NY", customers.get(4147).getState());
	}

	@Test
	@DisplayName("Record 4148: ZIP is 11219")
	void ZIPOfRecord4148() {
		assertEquals("11219", customers.get(4147).getZIP());
	}

	@Test
	@DisplayName("Record 4148: Phone is 718-236-4593")
	void PhoneOfRecord4148() {
		assertEquals("718-236-4593", customers.get(4147).getPhone());
	}

	@Test
	@DisplayName("Record 4148: Fax is 718-236-6502")
	void FaxOfRecord4148() {
		assertEquals("718-236-6502", customers.get(4147).getFax());
	}

	@Test
	@DisplayName("Record 4148: Email is ina@mcauley.com")
	void EmailOfRecord4148() {
		assertEquals("ina@mcauley.com", customers.get(4147).getEmail());
	}

	@Test
	@DisplayName("Record 4148: Web is http://www.inamcauley.com")
	void WebOfRecord4148() {
		assertEquals("http://www.inamcauley.com", customers.get(4147).getWeb());
	}
}
