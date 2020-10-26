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
class Record_4338 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4338: FirstName is Lakysha")
	void FirstNameOfRecord4338() {
		assertEquals("Lakysha", customers.get(4337).getFirstName());
	}

	@Test
	@DisplayName("Record 4338: LastName is Cate")
	void LastNameOfRecord4338() {
		assertEquals("Cate", customers.get(4337).getLastName());
	}

	@Test
	@DisplayName("Record 4338: Company is Banta Isg Bushman Press")
	void CompanyOfRecord4338() {
		assertEquals("Banta Isg Bushman Press", customers.get(4337).getCompany());
	}

	@Test
	@DisplayName("Record 4338: Address is 40 E Airy St")
	void AddressOfRecord4338() {
		assertEquals("40 E Airy St", customers.get(4337).getAddress());
	}

	@Test
	@DisplayName("Record 4338: City is Norristown")
	void CityOfRecord4338() {
		assertEquals("Norristown", customers.get(4337).getCity());
	}

	@Test
	@DisplayName("Record 4338: County is Montgomery")
	void CountyOfRecord4338() {
		assertEquals("Montgomery", customers.get(4337).getCounty());
	}

	@Test
	@DisplayName("Record 4338: State is PA")
	void StateOfRecord4338() {
		assertEquals("PA", customers.get(4337).getState());
	}

	@Test
	@DisplayName("Record 4338: ZIP is 19401")
	void ZIPOfRecord4338() {
		assertEquals("19401", customers.get(4337).getZIP());
	}

	@Test
	@DisplayName("Record 4338: Phone is 610-275-7785")
	void PhoneOfRecord4338() {
		assertEquals("610-275-7785", customers.get(4337).getPhone());
	}

	@Test
	@DisplayName("Record 4338: Fax is 610-275-7471")
	void FaxOfRecord4338() {
		assertEquals("610-275-7471", customers.get(4337).getFax());
	}

	@Test
	@DisplayName("Record 4338: Email is lakysha@cate.com")
	void EmailOfRecord4338() {
		assertEquals("lakysha@cate.com", customers.get(4337).getEmail());
	}

	@Test
	@DisplayName("Record 4338: Web is http://www.lakyshacate.com")
	void WebOfRecord4338() {
		assertEquals("http://www.lakyshacate.com", customers.get(4337).getWeb());
	}
}
