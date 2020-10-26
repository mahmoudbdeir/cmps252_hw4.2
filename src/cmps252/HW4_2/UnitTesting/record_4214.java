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
class Record_4214 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4214: FirstName is Brad")
	void FirstNameOfRecord4214() {
		assertEquals("Brad", customers.get(4213).getFirstName());
	}

	@Test
	@DisplayName("Record 4214: LastName is Stimus")
	void LastNameOfRecord4214() {
		assertEquals("Stimus", customers.get(4213).getLastName());
	}

	@Test
	@DisplayName("Record 4214: Company is Chem Pro Inc")
	void CompanyOfRecord4214() {
		assertEquals("Chem Pro Inc", customers.get(4213).getCompany());
	}

	@Test
	@DisplayName("Record 4214: Address is 320 Courthouse Rd")
	void AddressOfRecord4214() {
		assertEquals("320 Courthouse Rd", customers.get(4213).getAddress());
	}

	@Test
	@DisplayName("Record 4214: City is Princeton")
	void CityOfRecord4214() {
		assertEquals("Princeton", customers.get(4213).getCity());
	}

	@Test
	@DisplayName("Record 4214: County is Mercer")
	void CountyOfRecord4214() {
		assertEquals("Mercer", customers.get(4213).getCounty());
	}

	@Test
	@DisplayName("Record 4214: State is WV")
	void StateOfRecord4214() {
		assertEquals("WV", customers.get(4213).getState());
	}

	@Test
	@DisplayName("Record 4214: ZIP is 24740")
	void ZIPOfRecord4214() {
		assertEquals("24740", customers.get(4213).getZIP());
	}

	@Test
	@DisplayName("Record 4214: Phone is 304-425-9222")
	void PhoneOfRecord4214() {
		assertEquals("304-425-9222", customers.get(4213).getPhone());
	}

	@Test
	@DisplayName("Record 4214: Fax is 304-425-5723")
	void FaxOfRecord4214() {
		assertEquals("304-425-5723", customers.get(4213).getFax());
	}

	@Test
	@DisplayName("Record 4214: Email is brad@stimus.com")
	void EmailOfRecord4214() {
		assertEquals("brad@stimus.com", customers.get(4213).getEmail());
	}

	@Test
	@DisplayName("Record 4214: Web is http://www.bradstimus.com")
	void WebOfRecord4214() {
		assertEquals("http://www.bradstimus.com", customers.get(4213).getWeb());
	}
}
