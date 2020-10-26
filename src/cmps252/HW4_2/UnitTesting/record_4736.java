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

@Tag("34")
class Record_4736 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4736: FirstName is Lesley")
	void FirstNameOfRecord4736() {
		assertEquals("Lesley", customers.get(4735).getFirstName());
	}

	@Test
	@DisplayName("Record 4736: LastName is Carrigg")
	void LastNameOfRecord4736() {
		assertEquals("Carrigg", customers.get(4735).getLastName());
	}

	@Test
	@DisplayName("Record 4736: Company is Fisher Marants Renfro Stn Inc")
	void CompanyOfRecord4736() {
		assertEquals("Fisher Marants Renfro Stn Inc", customers.get(4735).getCompany());
	}

	@Test
	@DisplayName("Record 4736: Address is 700 W Mississippi Ave  #-d5")
	void AddressOfRecord4736() {
		assertEquals("700 W Mississippi Ave  #-d5", customers.get(4735).getAddress());
	}

	@Test
	@DisplayName("Record 4736: City is Denver")
	void CityOfRecord4736() {
		assertEquals("Denver", customers.get(4735).getCity());
	}

	@Test
	@DisplayName("Record 4736: County is Denver")
	void CountyOfRecord4736() {
		assertEquals("Denver", customers.get(4735).getCounty());
	}

	@Test
	@DisplayName("Record 4736: State is CO")
	void StateOfRecord4736() {
		assertEquals("CO", customers.get(4735).getState());
	}

	@Test
	@DisplayName("Record 4736: ZIP is 80223")
	void ZIPOfRecord4736() {
		assertEquals("80223", customers.get(4735).getZIP());
	}

	@Test
	@DisplayName("Record 4736: Phone is 303-744-7166")
	void PhoneOfRecord4736() {
		assertEquals("303-744-7166", customers.get(4735).getPhone());
	}

	@Test
	@DisplayName("Record 4736: Fax is 303-744-1031")
	void FaxOfRecord4736() {
		assertEquals("303-744-1031", customers.get(4735).getFax());
	}

	@Test
	@DisplayName("Record 4736: Email is lesley@carrigg.com")
	void EmailOfRecord4736() {
		assertEquals("lesley@carrigg.com", customers.get(4735).getEmail());
	}

	@Test
	@DisplayName("Record 4736: Web is http://www.lesleycarrigg.com")
	void WebOfRecord4736() {
		assertEquals("http://www.lesleycarrigg.com", customers.get(4735).getWeb());
	}
}
