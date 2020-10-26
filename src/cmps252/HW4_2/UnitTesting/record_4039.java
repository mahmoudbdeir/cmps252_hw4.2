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

@Tag("22")
class Record_4039 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4039: FirstName is King")
	void FirstNameOfRecord4039() {
		assertEquals("King", customers.get(4038).getFirstName());
	}

	@Test
	@DisplayName("Record 4039: LastName is Snowdeal")
	void LastNameOfRecord4039() {
		assertEquals("Snowdeal", customers.get(4038).getLastName());
	}

	@Test
	@DisplayName("Record 4039: Company is Traffic & Safety Signs Inc")
	void CompanyOfRecord4039() {
		assertEquals("Traffic & Safety Signs Inc", customers.get(4038).getCompany());
	}

	@Test
	@DisplayName("Record 4039: Address is 6615 Gleneden Beach Loop")
	void AddressOfRecord4039() {
		assertEquals("6615 Gleneden Beach Loop", customers.get(4038).getAddress());
	}

	@Test
	@DisplayName("Record 4039: City is Gleneden Beach")
	void CityOfRecord4039() {
		assertEquals("Gleneden Beach", customers.get(4038).getCity());
	}

	@Test
	@DisplayName("Record 4039: County is Lincoln")
	void CountyOfRecord4039() {
		assertEquals("Lincoln", customers.get(4038).getCounty());
	}

	@Test
	@DisplayName("Record 4039: State is OR")
	void StateOfRecord4039() {
		assertEquals("OR", customers.get(4038).getState());
	}

	@Test
	@DisplayName("Record 4039: ZIP is 97388")
	void ZIPOfRecord4039() {
		assertEquals("97388", customers.get(4038).getZIP());
	}

	@Test
	@DisplayName("Record 4039: Phone is 541-764-3362")
	void PhoneOfRecord4039() {
		assertEquals("541-764-3362", customers.get(4038).getPhone());
	}

	@Test
	@DisplayName("Record 4039: Fax is 541-764-2121")
	void FaxOfRecord4039() {
		assertEquals("541-764-2121", customers.get(4038).getFax());
	}

	@Test
	@DisplayName("Record 4039: Email is king@snowdeal.com")
	void EmailOfRecord4039() {
		assertEquals("king@snowdeal.com", customers.get(4038).getEmail());
	}

	@Test
	@DisplayName("Record 4039: Web is http://www.kingsnowdeal.com")
	void WebOfRecord4039() {
		assertEquals("http://www.kingsnowdeal.com", customers.get(4038).getWeb());
	}
}
