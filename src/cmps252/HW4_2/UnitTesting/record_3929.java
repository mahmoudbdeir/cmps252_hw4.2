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

@Tag("46")
class Record_3929 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3929: FirstName is Roberta")
	void FirstNameOfRecord3929() {
		assertEquals("Roberta", customers.get(3928).getFirstName());
	}

	@Test
	@DisplayName("Record 3929: LastName is Warlow")
	void LastNameOfRecord3929() {
		assertEquals("Warlow", customers.get(3928).getLastName());
	}

	@Test
	@DisplayName("Record 3929: Company is Sibisan, John J Esq")
	void CompanyOfRecord3929() {
		assertEquals("Sibisan, John J Esq", customers.get(3928).getCompany());
	}

	@Test
	@DisplayName("Record 3929: Address is 1000 16th St Nw  #-300")
	void AddressOfRecord3929() {
		assertEquals("1000 16th St Nw  #-300", customers.get(3928).getAddress());
	}

	@Test
	@DisplayName("Record 3929: City is Washington")
	void CityOfRecord3929() {
		assertEquals("Washington", customers.get(3928).getCity());
	}

	@Test
	@DisplayName("Record 3929: County is District of Columbia")
	void CountyOfRecord3929() {
		assertEquals("District of Columbia", customers.get(3928).getCounty());
	}

	@Test
	@DisplayName("Record 3929: State is DC")
	void StateOfRecord3929() {
		assertEquals("DC", customers.get(3928).getState());
	}

	@Test
	@DisplayName("Record 3929: ZIP is 20036")
	void ZIPOfRecord3929() {
		assertEquals("20036", customers.get(3928).getZIP());
	}

	@Test
	@DisplayName("Record 3929: Phone is 202-429-4857")
	void PhoneOfRecord3929() {
		assertEquals("202-429-4857", customers.get(3928).getPhone());
	}

	@Test
	@DisplayName("Record 3929: Fax is 202-429-9313")
	void FaxOfRecord3929() {
		assertEquals("202-429-9313", customers.get(3928).getFax());
	}

	@Test
	@DisplayName("Record 3929: Email is roberta@warlow.com")
	void EmailOfRecord3929() {
		assertEquals("roberta@warlow.com", customers.get(3928).getEmail());
	}

	@Test
	@DisplayName("Record 3929: Web is http://www.robertawarlow.com")
	void WebOfRecord3929() {
		assertEquals("http://www.robertawarlow.com", customers.get(3928).getWeb());
	}
}
