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

@Tag("7")
class Record_4283 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4283: FirstName is Patricia")
	void FirstNameOfRecord4283() {
		assertEquals("Patricia", customers.get(4282).getFirstName());
	}

	@Test
	@DisplayName("Record 4283: LastName is Bleything")
	void LastNameOfRecord4283() {
		assertEquals("Bleything", customers.get(4282).getLastName());
	}

	@Test
	@DisplayName("Record 4283: Company is Soifer, Mark Esq")
	void CompanyOfRecord4283() {
		assertEquals("Soifer, Mark Esq", customers.get(4282).getCompany());
	}

	@Test
	@DisplayName("Record 4283: Address is 1121 N Creyts Rd")
	void AddressOfRecord4283() {
		assertEquals("1121 N Creyts Rd", customers.get(4282).getAddress());
	}

	@Test
	@DisplayName("Record 4283: City is Lansing")
	void CityOfRecord4283() {
		assertEquals("Lansing", customers.get(4282).getCity());
	}

	@Test
	@DisplayName("Record 4283: County is Eaton")
	void CountyOfRecord4283() {
		assertEquals("Eaton", customers.get(4282).getCounty());
	}

	@Test
	@DisplayName("Record 4283: State is MI")
	void StateOfRecord4283() {
		assertEquals("MI", customers.get(4282).getState());
	}

	@Test
	@DisplayName("Record 4283: ZIP is 48917")
	void ZIPOfRecord4283() {
		assertEquals("48917", customers.get(4282).getZIP());
	}

	@Test
	@DisplayName("Record 4283: Phone is 517-323-6953")
	void PhoneOfRecord4283() {
		assertEquals("517-323-6953", customers.get(4282).getPhone());
	}

	@Test
	@DisplayName("Record 4283: Fax is 517-323-5545")
	void FaxOfRecord4283() {
		assertEquals("517-323-5545", customers.get(4282).getFax());
	}

	@Test
	@DisplayName("Record 4283: Email is patricia@bleything.com")
	void EmailOfRecord4283() {
		assertEquals("patricia@bleything.com", customers.get(4282).getEmail());
	}

	@Test
	@DisplayName("Record 4283: Web is http://www.patriciableything.com")
	void WebOfRecord4283() {
		assertEquals("http://www.patriciableything.com", customers.get(4282).getWeb());
	}
}
