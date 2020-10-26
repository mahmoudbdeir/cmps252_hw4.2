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

@Tag("11")
class Record_4454 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4454: FirstName is Lino")
	void FirstNameOfRecord4454() {
		assertEquals("Lino", customers.get(4453).getFirstName());
	}

	@Test
	@DisplayName("Record 4454: LastName is Sosa")
	void LastNameOfRecord4454() {
		assertEquals("Sosa", customers.get(4453).getLastName());
	}

	@Test
	@DisplayName("Record 4454: Company is Durbin Larimore & Bialick Pc")
	void CompanyOfRecord4454() {
		assertEquals("Durbin Larimore & Bialick Pc", customers.get(4453).getCompany());
	}

	@Test
	@DisplayName("Record 4454: Address is 3868 N Fratney St")
	void AddressOfRecord4454() {
		assertEquals("3868 N Fratney St", customers.get(4453).getAddress());
	}

	@Test
	@DisplayName("Record 4454: City is Milwaukee")
	void CityOfRecord4454() {
		assertEquals("Milwaukee", customers.get(4453).getCity());
	}

	@Test
	@DisplayName("Record 4454: County is Milwaukee")
	void CountyOfRecord4454() {
		assertEquals("Milwaukee", customers.get(4453).getCounty());
	}

	@Test
	@DisplayName("Record 4454: State is WI")
	void StateOfRecord4454() {
		assertEquals("WI", customers.get(4453).getState());
	}

	@Test
	@DisplayName("Record 4454: ZIP is 53212")
	void ZIPOfRecord4454() {
		assertEquals("53212", customers.get(4453).getZIP());
	}

	@Test
	@DisplayName("Record 4454: Phone is 414-961-5664")
	void PhoneOfRecord4454() {
		assertEquals("414-961-5664", customers.get(4453).getPhone());
	}

	@Test
	@DisplayName("Record 4454: Fax is 414-961-0362")
	void FaxOfRecord4454() {
		assertEquals("414-961-0362", customers.get(4453).getFax());
	}

	@Test
	@DisplayName("Record 4454: Email is lino@sosa.com")
	void EmailOfRecord4454() {
		assertEquals("lino@sosa.com", customers.get(4453).getEmail());
	}

	@Test
	@DisplayName("Record 4454: Web is http://www.linososa.com")
	void WebOfRecord4454() {
		assertEquals("http://www.linososa.com", customers.get(4453).getWeb());
	}
}
