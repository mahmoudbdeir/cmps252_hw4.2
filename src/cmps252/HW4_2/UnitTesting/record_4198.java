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

@Tag("1")
class Record_4198 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4198: FirstName is Vicki")
	void FirstNameOfRecord4198() {
		assertEquals("Vicki", customers.get(4197).getFirstName());
	}

	@Test
	@DisplayName("Record 4198: LastName is Foulkes")
	void LastNameOfRecord4198() {
		assertEquals("Foulkes", customers.get(4197).getLastName());
	}

	@Test
	@DisplayName("Record 4198: Company is Agrcltl & Ind Mus York Cnty")
	void CompanyOfRecord4198() {
		assertEquals("Agrcltl & Ind Mus York Cnty", customers.get(4197).getCompany());
	}

	@Test
	@DisplayName("Record 4198: Address is 603 S Washington Ave")
	void AddressOfRecord4198() {
		assertEquals("603 S Washington Ave", customers.get(4197).getAddress());
	}

	@Test
	@DisplayName("Record 4198: City is Lansing")
	void CityOfRecord4198() {
		assertEquals("Lansing", customers.get(4197).getCity());
	}

	@Test
	@DisplayName("Record 4198: County is Ingham")
	void CountyOfRecord4198() {
		assertEquals("Ingham", customers.get(4197).getCounty());
	}

	@Test
	@DisplayName("Record 4198: State is MI")
	void StateOfRecord4198() {
		assertEquals("MI", customers.get(4197).getState());
	}

	@Test
	@DisplayName("Record 4198: ZIP is 48933")
	void ZIPOfRecord4198() {
		assertEquals("48933", customers.get(4197).getZIP());
	}

	@Test
	@DisplayName("Record 4198: Phone is 517-372-2513")
	void PhoneOfRecord4198() {
		assertEquals("517-372-2513", customers.get(4197).getPhone());
	}

	@Test
	@DisplayName("Record 4198: Fax is 517-372-6131")
	void FaxOfRecord4198() {
		assertEquals("517-372-6131", customers.get(4197).getFax());
	}

	@Test
	@DisplayName("Record 4198: Email is vicki@foulkes.com")
	void EmailOfRecord4198() {
		assertEquals("vicki@foulkes.com", customers.get(4197).getEmail());
	}

	@Test
	@DisplayName("Record 4198: Web is http://www.vickifoulkes.com")
	void WebOfRecord4198() {
		assertEquals("http://www.vickifoulkes.com", customers.get(4197).getWeb());
	}
}
