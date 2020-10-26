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

@Tag("47")
class Record_2208 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2208: FirstName is Roberta")
	void FirstNameOfRecord2208() {
		assertEquals("Roberta", customers.get(2207).getFirstName());
	}

	@Test
	@DisplayName("Record 2208: LastName is Faust")
	void LastNameOfRecord2208() {
		assertEquals("Faust", customers.get(2207).getLastName());
	}

	@Test
	@DisplayName("Record 2208: Company is Jackson Stationery & Ofc Supl")
	void CompanyOfRecord2208() {
		assertEquals("Jackson Stationery & Ofc Supl", customers.get(2207).getCompany());
	}

	@Test
	@DisplayName("Record 2208: Address is 2047 Victory Blvd")
	void AddressOfRecord2208() {
		assertEquals("2047 Victory Blvd", customers.get(2207).getAddress());
	}

	@Test
	@DisplayName("Record 2208: City is Staten Island")
	void CityOfRecord2208() {
		assertEquals("Staten Island", customers.get(2207).getCity());
	}

	@Test
	@DisplayName("Record 2208: County is Richmond")
	void CountyOfRecord2208() {
		assertEquals("Richmond", customers.get(2207).getCounty());
	}

	@Test
	@DisplayName("Record 2208: State is NY")
	void StateOfRecord2208() {
		assertEquals("NY", customers.get(2207).getState());
	}

	@Test
	@DisplayName("Record 2208: ZIP is 10314")
	void ZIPOfRecord2208() {
		assertEquals("10314", customers.get(2207).getZIP());
	}

	@Test
	@DisplayName("Record 2208: Phone is 718-494-6173")
	void PhoneOfRecord2208() {
		assertEquals("718-494-6173", customers.get(2207).getPhone());
	}

	@Test
	@DisplayName("Record 2208: Fax is 718-494-2411")
	void FaxOfRecord2208() {
		assertEquals("718-494-2411", customers.get(2207).getFax());
	}

	@Test
	@DisplayName("Record 2208: Email is roberta@faust.com")
	void EmailOfRecord2208() {
		assertEquals("roberta@faust.com", customers.get(2207).getEmail());
	}

	@Test
	@DisplayName("Record 2208: Web is http://www.robertafaust.com")
	void WebOfRecord2208() {
		assertEquals("http://www.robertafaust.com", customers.get(2207).getWeb());
	}
}
