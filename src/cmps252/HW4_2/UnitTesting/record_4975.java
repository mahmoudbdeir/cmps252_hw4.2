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

@Tag("5")
class Record_4975 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4975: FirstName is Dawn")
	void FirstNameOfRecord4975() {
		assertEquals("Dawn", customers.get(4974).getFirstName());
	}

	@Test
	@DisplayName("Record 4975: LastName is Muenzenberger")
	void LastNameOfRecord4975() {
		assertEquals("Muenzenberger", customers.get(4974).getLastName());
	}

	@Test
	@DisplayName("Record 4975: Company is Newark Ironbound Electrl Supl")
	void CompanyOfRecord4975() {
		assertEquals("Newark Ironbound Electrl Supl", customers.get(4974).getCompany());
	}

	@Test
	@DisplayName("Record 4975: Address is 155 Westminster St")
	void AddressOfRecord4975() {
		assertEquals("155 Westminster St", customers.get(4974).getAddress());
	}

	@Test
	@DisplayName("Record 4975: City is Providence")
	void CityOfRecord4975() {
		assertEquals("Providence", customers.get(4974).getCity());
	}

	@Test
	@DisplayName("Record 4975: County is Providence")
	void CountyOfRecord4975() {
		assertEquals("Providence", customers.get(4974).getCounty());
	}

	@Test
	@DisplayName("Record 4975: State is RI")
	void StateOfRecord4975() {
		assertEquals("RI", customers.get(4974).getState());
	}

	@Test
	@DisplayName("Record 4975: ZIP is 2903")
	void ZIPOfRecord4975() {
		assertEquals("2903", customers.get(4974).getZIP());
	}

	@Test
	@DisplayName("Record 4975: Phone is 401-272-2334")
	void PhoneOfRecord4975() {
		assertEquals("401-272-2334", customers.get(4974).getPhone());
	}

	@Test
	@DisplayName("Record 4975: Fax is 401-272-4372")
	void FaxOfRecord4975() {
		assertEquals("401-272-4372", customers.get(4974).getFax());
	}

	@Test
	@DisplayName("Record 4975: Email is dawn@muenzenberger.com")
	void EmailOfRecord4975() {
		assertEquals("dawn@muenzenberger.com", customers.get(4974).getEmail());
	}

	@Test
	@DisplayName("Record 4975: Web is http://www.dawnmuenzenberger.com")
	void WebOfRecord4975() {
		assertEquals("http://www.dawnmuenzenberger.com", customers.get(4974).getWeb());
	}
}
